package com.ncu.testLogger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestSlf4jJDKLog {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(TestSlf4jJDKLog.class);
        logger.error("log level error ");
    }
}
