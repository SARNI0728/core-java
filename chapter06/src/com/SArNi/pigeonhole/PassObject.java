package com.SArNi.pigeonhole;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/13 11:16
 * @Version 1.0
 */
public class PassObject {
    public static void printAreas(Circle c, int time){
        System.out.println("Radius\t\t\tArea" );
        for (int i = 1; i <= time; i++) {
            System.out.println(i + "\t\t\t" + c.findArea(i));
        }
    }
}
