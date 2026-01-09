package Polymorphism.exer1;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/16 15:16
 * @Version 1.0
 */
public class GeometricTest {
    public static boolean equalsArea(GrometricObject g1,GrometricObject g2){
        System.out.println(g1.getArea());
        System.out.println(g2.getArea());
        if(g1.getArea() == g2.getArea()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        GrometricObject c = new Circle(2.0,"black",1.0);
        GrometricObject r = new MyRectangle(2.0,3.0,"white",10.0);
        System.out.println(equalsArea(c,r));
    }
}
