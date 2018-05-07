package com.example.gradle.gradle_second;

/**
 * @author fengrui.yang@11bee.com
 * @date 2018/4/27 12:02
 * Not to force yourself to know how powerful you are
 */
public class Singleton {
    private Singleton() {
    }

    private static Singleton getInstance() {
        return SingletonHolder.Instance;
    }

    /**
     * 静态内部类
     */
    private static class SingletonHolder {
        private static final Singleton Instance = new Singleton();
    }
}
