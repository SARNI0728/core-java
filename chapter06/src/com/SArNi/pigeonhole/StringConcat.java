package com.SArNi.pigeonhole;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/8 9:36
 * @Version 1.0
 */
public class StringConcat {
    public void concat(String ... str){
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + ",");
        }
    }
}
