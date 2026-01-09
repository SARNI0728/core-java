package november.twenty_three.employeetest;

import java.time.LocalDate;

public class Employee {
    String name;
    String id;
    int sex;
    int age;
    LocalDate hireDate;
    double salary;
    String location;

    public Employee(String name, String id, int sex, int age, LocalDate hireDate, double salary, String location) {
        this.name = name;
        this.id = id;
        this.sex = sex;
        this.age = age;
        this.hireDate = hireDate;
        this.salary = salary;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
