package com.example.gradle.gradle_second.Log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author fengrui.yang@11bee.com
 * @date 2018/4/26 21:56
 * Not to force yourself to know how powerful you are
 */
@Service
public class Logback {
    private final static Logger logger = LoggerFactory.getLogger(Logback.class);

    public static void main(String[] args) {
        logger.info("sout info");
    }
}
