public class Person{
    String name;
    int age = 1;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    private String talking(int grade,String msg){
        return grade + "年级的学生说：" + msg;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }

    private Person(String name, int age){
        this.name=name;
        this.age=age;
    }

}
