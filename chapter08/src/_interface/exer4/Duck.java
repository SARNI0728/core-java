package _interface.exer4;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/15 19:51
 * @Version 1.0
 */
public class Duck implements Flyable,Swimmable{
    public void fly(){
        System.out.println("鸭子在飞翔");
    }
    public void swim(){
        System.out.println("鸭子在游泳");
    }
}
