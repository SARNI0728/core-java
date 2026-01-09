package com.SArNi.pigeonhole;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/7 22:50
 * @Version 1.0
 */

public class Student {
    int number,state,score;
    public static void main(String[] args){
        Student[] stu = new Student[20];
        for(int i = 0;i < stu.length;i++){
            stu[i] = new Student();
            stu[i].number = i;
            stu[i].state = (int)(Math.random() * (6 - 1 + 1) + 1);
            stu[i].score = (int)(Math.random() * (100 - 0 + 1));
            if(stu[i].state == 3){
                System.out.println("学号为{"+ stu[i].number +"}的3年级学生的成绩为"
                + stu[i].score);
            }
        }
        for (int r = 0; r < stu.length;r++){
            Student temp;
            for (int i = 0,j = 1; j < stu.length - r;i++,j++){
                if(stu[i].score > stu[j].score){
                    temp = stu[j];
                    stu[j] = stu[i];
                    stu[i] = temp;
                }
            }
        }
        for (int i = 0; i < stu.length; i++) {
            System.out.println("学号：" + stu[i].number + "的成绩为："
                    + stu[i].score + "年级：" + stu[i].state
            );
        }
    }
}
