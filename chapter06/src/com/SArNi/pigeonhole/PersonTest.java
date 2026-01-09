package com.SArNi.pigeonhole;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/6 23:52
 * @Version 1.0
 */

public class PersonTest {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.age = 24;
        p1.gender = 1;
        p1.name = "Tony";
        p1.show_age();
        p1.add_age();
        p1.show_age();
        p1.study();
    }
}
