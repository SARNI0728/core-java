package Polymorphism.exer2;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/16 16:23
 * @Version 1.0
 */
public class InstanceTest {
    public static void method(Person e){
        System.out.println(e.getInfo());
        if(e instanceof Graduate)
            System.out.println("a graduate student");
        if(e instanceof Student)
            System.out.println("a student");
        if(e instanceof Person)
            System.out.println("a person");
    }

    public static void main(String[] args) {
        Graduate g = new Graduate();
        Student s = new Student();
        Person p = new Person();
        method(s);
    }

}
