package Polymorphism.exer1;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/16 15:06
 * @Version 1.0
 */
public class GrometricObject {
    protected String color;
    protected double weight;
    public GrometricObject(){

    }
    public GrometricObject(String color,double weight){
        this.color = color;
        this.weight = weight;
    }
    public double getArea(){
        return 1.0;
    }
}
