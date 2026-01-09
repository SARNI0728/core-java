package com.SArNi.constructor;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/13 16:15
 * @Version 1.0
 */
public class Student {
    String name;
    int age;
    String school;
    String major;
    Student(String n,int a){
        name = n;
        age = a;
    }
    Student(String n,int a,String s){
        name = n;
        age = a;
        school = s;
    }
    Student(String n,int a,String s,String m){
        name = n;
        age = a;
        school = s;
        major = m;
    }
}
