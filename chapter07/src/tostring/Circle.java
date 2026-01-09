package tostring;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/27 20:24
 * @Version 1.0
 */
public class Circle extends GrometricObject{
    double radius;
    public Circle() {
    }
    public Circle(double radius,String color,double weight){
        super(color,weight);
        this.radius = radius;
    }
    public double findArea(){
        return 3.14 * radius * radius;
    }
    public boolean equals(Object anCircle){
        if(this == anCircle)
            return true;
        if(anCircle instanceof Circle)
            return this.radius == ((Circle)anCircle).radius;
        return false;
    }
    @Override
    public String toString(){
        return("Radius == " + this.radius);
    }
}
