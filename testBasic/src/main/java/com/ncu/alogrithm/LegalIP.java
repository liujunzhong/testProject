package com.ncu.alogrithm;

/**
 * @Author ljz
 * @Date 2019/12/26 13:12
 * @Version 1.0
 **/
public class LegalIP {
    public static void main(String[] args) {
        String ip = "a**1.1.1";
        boolean legalIP = isLegalIP(ip);
        System.out.println(legalIP);
    }

    public static boolean isLegalIP(String ipAddress){
        if(!ipAddress.contains(".")){
            return false;
        }
        System.out.println("ipaddress.contains(.)" + ipAddress.split("[*]").length);
        if(ipAddress.split("\\.").length != 4) return false;
        String[] split = ipAddress.split("\\.");
        boolean flag = true;
        for (String field : split) {
            try {
                Integer integer = Integer.valueOf(field);
                if(integer>=0 && integer<=255){
                    continue;
                }
            }catch (Exception e){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
