package com.example.gradle.gradle_second;

import com.example.gradle.gradle_second.GuavaCache.GuavaCacheTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@SpringBootApplication(exclude =  DataSourceAutoConfiguration.class)
@Controller
@RequestMapping("/control/test")
public class GradleSecondApplication {

    @Resource
    private GuavaCacheTest guavaCacheTest;

    public static void main(String[] args) {
        SpringApplication.run(GradleSecondApplication.class, args);
    }

    @RequestMapping("/helloWorld")
    @ResponseBody
    public String helloWorld(){
        return "helloWorld";
    }

    @RequestMapping("/cache")
    @ResponseBody
    public String cache(){
        String hello= "hello";
        try {
            hello = guavaCacheTest.getCache(hello);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hello;
    }
}
