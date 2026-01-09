package _exception.exer1;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/25 10:58
 * @Version 1.0
 */
public class ExerTest1 {
    public static void main(String[] args) {
        try{
        Person p = new Person("SArNi",-100);
        System.out.println(p.toString());
        }catch (NoLifeValueException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("The end of Program");
        }
    }

}
