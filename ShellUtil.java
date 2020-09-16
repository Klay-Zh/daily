package com.sinosoft.util;

import ch.ethz.ssh2.ChannelCondition;
import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.Session;
import ch.ethz.ssh2.StreamGobbler;
import org.apache.tomcat.util.http.fileupload.IOUtils;

import java.io.*;
import java.nio.charset.Charset;
import java.util.concurrent.Executor;

public class ShellUtil {
    private Connection conn;
      /** 远程机器IP */
            private String ip;
      /** 用户名 */
             private String osUsername;
       /** 密码 */
             private String password;
       private String charset = Charset.defaultCharset().toString();
      private static final int TIME_OUT = 1000 * 5 * 60;
       /**
  27       * 构造函数
  28       * @param ip
  29       * @param usr
  30       * @param pasword
  31       */
             public ShellUtil(String ip, String usr, String pasword) {
                   this.ip = ip;
                 this.osUsername = usr;
                 this.password = pasword;
              }
       /**
  40      * 登录
  41      * @return
  42      * @throws IOException
  43      */
              private boolean login() throws IOException {
                conn = new Connection(ip);
                conn.connect();
                return conn.authenticateWithPassword(osUsername, password);
             }
    /**
  51      * 执行脚本
  52      *
  53      * @param cmds
  54      * @return
  55      * @throws Exception
  56      */
      public String exec(String cmds) throws Exception {
                 InputStream stdOut = null;
                InputStream stdErr = null;
          String result="";
                  int ret = -1;
                 try {
                      if (login()) {
                             Session session = conn.openSession();
                              session.execCommand(cmds);
                             stdOut = new StreamGobbler(session.getStdout());
                              result = processStream(stdOut, charset);
                              if(isStrEmpty(result)){
                                   stdErr = new StreamGobbler(session.getStderr());
                                  result = processStream(stdErr, charset);
                              }

                            session.waitForCondition(ChannelCondition.EXIT_STATUS, TIME_OUT);
//                            ret = session.getExitStatus();
                          System.out.println("result="+result);
                         } else {
                              throw new Exception("登录远程机器失败" + ip); // 自定义异常类 实现略
                        }
                   } finally {
                      if (conn != null) {
                              conn.close();
                            }
                        IOUtils.closeQuietly(stdOut);
                         IOUtils.closeQuietly(stdErr);
                   }
                 return result;
            }
    /**
  96      * @param in
  97      * @param charset
  98      * @return
  99      * @throws IOException
  100      * @throws UnsupportedEncodingException
  101      */
              private String processStream(InputStream in, String charset) throws Exception {
                  StringBuffer buffer = new StringBuffer();;
                  try {
                      BufferedReader br = new BufferedReader(new InputStreamReader(in,charset));
                      String line=null;
                      while((line=br.readLine()) != null){
                          buffer.append(line+"\n");
                      }
                  } catch (UnsupportedEncodingException e) {
                      e.printStackTrace();
                  } catch (IOException e) {
                      e.printStackTrace();
                  }
                  return buffer.toString();
              }
    private  boolean isStrEmpty(String str) {
        return (str == null || str.trim().equals("") || "null".equals(str));
    }
            public static void main(String args[]) throws Exception {
                ShellUtil executor = new ShellUtil("127.0.0.1", "mid", "mid");
                System.out.println(executor.exec("sh /app/logsshell.sh state"));
                System.out.println("---------end---------");
          }
}
