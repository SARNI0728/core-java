import java.time.LocalDate;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/4 17:44
 * @Version 1.0
 */
public class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private LocalDate BirthDay;

    @Override
    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());
    }

    public Employee() {
    }

    public Employee(String name, int age, LocalDate birthDay) {
        this.name = name;
        this.age = age;
        BirthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", BirthDay=" + BirthDay +
                '}';
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

    public LocalDate getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        BirthDay = birthDay;
    }
}
