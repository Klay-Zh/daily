package com.yiche.nettest.controller;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class HmacSha1AndBase64 {
    public void service(String key,String info){
        try{
            byte[] data = key.getBytes("UTF-8");
            SecretKey secretKey = new SecretKeySpec(data, "HmacSHA1");
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(secretKey);
            byte[] text = info.getBytes("UTF-8");
            System.out.println(Base64.getEncoder().encodeToString(mac.doFinal(text)));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
