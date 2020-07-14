package com.ncu.testSyntax;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class TestSplit {


    public static void main(String[] args) {
        String str = "  a  b c";
        String[] s = str.split(" ");
        for (String a : s) {
            System.out.println("1" + a);
        }
        Arrays.stream(s).forEach(System.out::println);
    }
}
