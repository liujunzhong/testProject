package com.ncu.syntax;

import java.util.Properties;

public class FinalField {
    private final String name;

    public FinalField(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Properties properties = System.getProperties();
        for(;;){
            properties.put(new FinalField("key"),"val");
        }
    }
}
