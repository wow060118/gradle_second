package com.example.gradle.gradle_second.GuavaCache;

import com.example.gradle.gradle_second.Singleton;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.springframework.stereotype.Service;

import java.util.concurrent.*;

/**
 * @author fengrui.yang@11bee.com
 * @date 2018/4/26 22:03
 * Not to force yourself to know how powerful you are
 */
@Service
public class GuavaCacheTest {
    private final static Cache<String,String> stringCacher = CacheBuilder.newBuilder().maximumSize(1000).
            expireAfterWrite(10, TimeUnit.MINUTES).build();

    private final static ExecutorService executor = Executors.newFixedThreadPool(10);

    public String getCache(String param) throws Exception{
        String hello = stringCacher.get(param, new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("走的是cache");
                return "world";
            }
        });
        System.out.println(hello);
        return hello;
    }

    public static void main(String[] args) {
        Singleton singleton =Singleton.getInstance();
        String s1 = singleton.getCache("asd", "123");
        System.out.println(s1);
        String s2 = singleton.getCache("asd", "123");
        System.out.println(s2);
    }
}
