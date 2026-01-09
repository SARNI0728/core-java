package Polymorphism.exer1;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/16 15:10
 * @Version 1.0
 */
public class MyRectangle extends GrometricObject{
    double length;
    double width;
    MyRectangle(){

    }
    MyRectangle(double width,double length, String color,double weight){
        this.width = width;
        this.length = length;
        super.color = color;
        super.weight = weight;
    }
    public double getArea(){
        return length * width;
    }
}
