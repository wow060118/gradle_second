package com.example.gradle.gradle_second;

import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author fengrui.yang@11bee.com
 * @date 2018/4/27 12:02
 * Not to force yourself to know how powerful you are
 */
public class Singleton {
    private static ConcurrentHashMap<String, String> cacheMap = new ConcurrentHashMap<>();
    private static Date date = null;
    private Singleton() {}

    private static Singleton single=null;
    //静态工厂方法
    public static Singleton getInstance() {
        if (single == null) {
            single = new Singleton();
        }
        return single;
    }

    /**
     * 获取缓存的对象
     *
     * @param account
     * @return
     */
    public  String getCache(String account,String key) {

        account = getCacheKey(account);
        // 如果缓冲中有该账号，则返回value
        if (cacheMap.containsKey(account)) {
            return cacheMap.get(account);
        }
        // 如果缓存中没有该账号，把该帐号对象缓存到concurrentHashMap中
        initCache(account,key);
        return cacheMap.get(account);
    }

    /**
     * 初始化缓存
     *
     * @param account
     */
    private  void initCache(String account,String key) {
        cacheMap.put(account, key);
    }

    /**
     * 拼接一个缓存key
     *
     * @param account
     * @return
     */
    private  String getCacheKey(String account) {
        return Thread.currentThread().getId() + "-" + account;
    }

    /**
     * 移除缓存信息
     *
     * @param account
     */
    private  void removeCache(String account) {
        cacheMap.remove(getCacheKey(account));
    }
}
