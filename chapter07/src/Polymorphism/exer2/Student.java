package Polymorphism.exer2;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/16 16:32
 * @Version 1.0
 */
class Student extends Person {
    protected String school="pku";
    public String getInfo() {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school;
    }
}
