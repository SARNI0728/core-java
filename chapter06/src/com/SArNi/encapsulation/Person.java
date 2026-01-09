package com.SArNi.encapsulation;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/13 15:46
 * @Version 1.0
 */
public class Person {
    private int age;

    public void setAge(int a) {
        if (a >= 0 && a <= 130) {
            age = a;
            System.out.println("年龄设置好了");
        } else
            System.out.println("输入不合法");
    }
    public void getAge(){
        System.out.println("年龄为" + age);
    }
}

