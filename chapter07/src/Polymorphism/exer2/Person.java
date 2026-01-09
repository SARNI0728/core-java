package Polymorphism.exer2;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/16 16:32
 * @Version 1.0
 */
class Person {
    protected String name="person";
    protected int age=50;
    public String getInfo() {
        return "Name: "+ name + "\n" +"age: "+ age;
    }
}