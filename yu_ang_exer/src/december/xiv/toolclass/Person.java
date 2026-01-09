package december.xiv.toolclass;

public class Person {
    String name;
    int age;
    Person(){
    }
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String introduceSelf(String country){
        return "我叫" + name + "，我现在" + age + "岁了" + "我现在在" + country;
    }
}
