package com.SArNi.pigeonhole;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/8 8:20
 * @Version 1.0
 */
public class OverLoadTest {
    public static void main(String[] args){
        OverLoad ol = new OverLoad();
        int a = ol.mOL(5);
        int b = ol.mOL(5,6);
        ol.mOL("这是一个字符串");
        System.out.println("" + a + b);
    }
}
