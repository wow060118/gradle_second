package com.example.gradle.gradle_second;

/**
 * @author fengrui.yang@11bee.com
 * @date 2018/4/27 12:06
 * Not to force yourself to know how powerful you are
 */
public class psvm {

    public static void main(String[] args) {
        BaiduApi b=BaiduApi.getInstance();
        byte[] bb=new byte[5];
        System.out.println("address:"+b+"   value:"+b.getAuthCode(bb));

        BaiduApi bbb=BaiduApi.getInstance();
        byte[] bbbb=new byte[5];
        System.out.println("address:"+bbb+"   value:"+b.getAuthCode(bbbb));

    }
}
