package com.SArNi.pigeonhole;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/8 7:56
 * @Version 1.0
 */
public class Rectangle {
    double len;//长度
    double width; //宽度
    public double area(){
        //返回矩阵面积
        return len*width;
    }
    public double perimeter(){
        //返回矩阵周长
        return 2*(len + width);
    }
    public void detail(){
        System.out.println("矩阵的长为：" + len + "矩阵的宽为:" +
                width + "周长：" + perimeter() + " 面积：" + area());
    }
}
