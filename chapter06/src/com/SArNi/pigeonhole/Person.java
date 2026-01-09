package com.SArNi.pigeonhole;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/6 23:48
 * @Version 1.0
 */
public class Person{
    String name;
    int age,gender;
    public void study(){
        System.out.println("Studying....");
    }
    public void show_age(){
        System.out.println("It's age: " + age);
    }

    public int add_age(){
        age +=2;
        return age;
    }
}
