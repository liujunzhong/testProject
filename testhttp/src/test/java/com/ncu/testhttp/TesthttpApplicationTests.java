package com.ncu.testhttp;


import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

class TesthttpApplicationTests {

    @Test
    void sendToController() {
        System.out.println("hello test");

        {
            String fullUrl = "http://127.0.0.1:8080/sms/send" + "?message=" + "aaa";
            OutputStreamWriter out = null;

            BufferedReader in = null;
            String result = "";
            try {
                URL realUrl = new URL(fullUrl);
                URLConnection conn = realUrl.openConnection();
                conn.setRequestProperty("accept", "*/*");
                conn.setRequestProperty("contentType","utf-8");
                conn.setRequestProperty("connection", "Keep-Alive");
                conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
                conn.setDoOutput(true);
                conn.setDoInput(true);

//                out = new OutputStreamWriter(conn.getOutputStream());
//                out.write("aaa");
//                out.flush();
                // 建立实际的连接
                conn.connect();
                // 响应头部获取
                conn.getHeaderFields();
//                Map<String, List<String>> headers = conn.getHeaderFields();
                // 遍历所有的响应头字段
//                for (String key : headers.keySet()) {
//                    System.out.println(key + "\t：\t" + headers.get(key));
//                }

//                in = new BufferedReader(
//                        new InputStreamReader(conn.getInputStream()));
//                String line;
//                while ((line = in.readLine()) != null) {
//                    result += "\n" + line;
//                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (out != null) {
                        out.close();
                    }
                    if (in != null) {
                        in.close();
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
//            return result;
        }
    }

}
