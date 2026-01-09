package Polymorphism.exer1;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/16 15:07
 * @Version 1.0
 */
public class Circle extends GrometricObject{
    public double radius;
    Circle(){

    }
    Circle(double radius,String color,double weight){
        this.radius = radius;
        this.color = color;
        this.weight = weight;
    }
    public double getArea(){
        return 3.14 * radius * radius;
    }
}
