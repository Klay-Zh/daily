package com.sinosoft.lis.httpservice;

    import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

    public class Read {
        private static Connection con;

        public static void main(String[] args) throws FileNotFoundException, SQLException {
            String path = "E:\\pos\\2020-01月";
            List<File> list = getFile(path);
            System.out.println("---------文件数量" + list.size() + "---------");
            long start = System.currentTimeMillis();
            if (!list.isEmpty()) {
                System.out.println("---------循环处理文件---------");
                long startTime = System.currentTimeMillis();
                for(File f:list) {

                    Scanner in = new Scanner(f);

                    getConnect();
                    System.out.println("数据库连接成功");
                    insert_data(in);

                    long EndTime = System.currentTimeMillis();
                    long time = (EndTime - startTime) / 1000;

                    System.out.println("导入数据共用时：" + time);
                }
            }
        }

        private static void insert_data(Scanner in) throws SQLException
        {
            int count = 0;
            String sql = "insert into LXXML_SERVICE (TraceID,ServiceName,ReqDate)"
                    + "values(?,?,?)";

            con.setAutoCommit(false);
            PreparedStatement pstmt = con.prepareStatement(sql);
            in.next();
            while (in.hasNext())
            {
                String temp1 = in.nextLine();
                String[] temp = temp1.split(",");
                if (temp.length < 3)
                continue;

                if (temp.length == 3)
                {
                    pstmt.setString(1, temp[0].replace("\"",""));
                    pstmt.setString(2, temp[1].replace("\"",""));
                    pstmt.setString(3, temp[2].replace("\"",""));
                }

                pstmt.addBatch();

                count++;

                if (count == 20000)
                {
                    count = execute(pstmt, count);
                }
            }
            pstmt.executeBatch();
            con.commit();

        }

        public static  List<File>  getFile(String path){
            File f = new File(path);
            File[] files = f.listFiles();
            List<File> fileList = new ArrayList<>();
            if(files.length!=0) {
                for (File fs : files) {
                    if (fs.isFile()) {
                        System.out.println(fs.getName());
                        fileList.add(fs);
                    } else if (!fs.exists()) {
                        throw new NullPointerException("没有发现文件!");
                    }
                }
            }
            return fileList;
        }
        public static int execute(PreparedStatement pstmt, int count) throws SQLException
        {

            pstmt.executeBatch();
            con.commit();
            return 0;

        }

        private static void getConnect()
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(
                        "jdbc:mysql://10.1.128.55:8066/mycat_test?useUnicode=true&characterEncoding=utf8&useServerPrepStmts=false&rewriteBatchedStatements=true",
                        "root", "root");
            }
            catch (ClassNotFoundException | SQLException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }




