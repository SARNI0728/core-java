package com.SArNi.pigeonhole;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/8 8:17
 * @Version 1.0
 */
public class OverLoad {
    public int mOL(int a){
        return a*a;
    }
    public int mOL(int a,int b){
        return a*b;
    }
    public void mOL(String s){
        System.out.println(s);
    }
}
