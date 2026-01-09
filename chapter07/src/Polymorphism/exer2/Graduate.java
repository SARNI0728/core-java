package Polymorphism.exer2;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/16 16:32
 * @Version 1.0
 */
class Graduate extends Student{
    public String major="IT";
    public String getInfo()
    {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school+"\nmajor:"+major;
    }
}