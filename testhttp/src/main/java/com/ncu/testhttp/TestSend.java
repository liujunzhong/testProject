package com.ncu.testhttp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

/**
 * @Author ljz
 * @Date 2019/12/20 14:58
 * @Version 1.0
 **/
public class TestSend {
    public static void main(String[] args) {
        String message = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<svc_init ver=\"2.0.0\">\n" +
                "\t<sms ver=\"2.0.0\">\n" +
                "\t\t<client>\n" +
                "\t\t\t<id>262</id>\n" +
                "\t\t\t<pwd>2hDnDRQz06Tj2+i/xS15t55V26vQt9NIL8oKGBFXKWM8Zbeya8bexQ==</pwd>\n" +
                "\t\t\t<serviceid></serviceid>\n" +
                "\t\t</client>\n" +
                "\t\t<sms_info>\n" +
                "\t\t\t<phone>15979053167</phone>\n" +
                "\t\t\t<content>短信内容</content>\n" +
                "\t\t</sms_info>\n" +
                "\t</sms>\n" +
                "</svc_init>\n";
        sendMessage(message);
    }

    public static String sendMessage(String message) {

        String url = "http://223.82.247.212:8080/sjb/HttpSendSMSService";
        OutputStreamWriter out = null;

        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            URLConnection conn = realUrl.openConnection();
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("contentType", "utf-8");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            conn.setDoOutput(true);
            conn.setDoInput(true);

            out = new OutputStreamWriter(conn.getOutputStream());
            out.write(message);
            out.flush();


            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += "\n" + line;
            }
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
        return result;
    }
}
