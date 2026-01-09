package com.SArNi.pigeonhole;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/13 11:27
 * @Version 1.0
 */
public class RecursionDemo {
    public int get_num(int a){
        if(a <= 1)
            return a;
        return a + get_num(a-1);
    }
    public int get_fact(int a){
        if(a <= 1)
            return 1;
        return a * get_fact(a - 1);
    }
    public int Exe3(int a){
        if(a == 0)
            return 1;
        if (a == 1)
            return 4;
        return 2 * Exe3(a-1) + Exe3(a-2);
    }
    public static void main(String[] args) {
        RecursionDemo r = new RecursionDemo();
        System.out.println(r.Exe3(10));
    }
}
