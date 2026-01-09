package com.SArNi.pigeonhole;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/7 22:35
 * @Version 1.0
 */

import java.util.Scanner;

public class User {
    String name;
    String password;
    public void login(){
        System.out.println("请输入密码：");
        Scanner input = new Scanner(System.in);
        String temp = input.next();
        if(temp.equals(password)){
            System.out.println("欢迎，" + name + "!");
        }
        else{
            System.out.println("用户名或密码错误！");
        }
    }
}
