package november.twenty_eight.sortemployees;

import java.time.LocalDate;

public class Employee implements Comparable<Employee> {
    String name;
    String eid;
    int age;
    char sex;
    LocalDate hireDate;
    double salary;
    String location;

    @Override
    public int compareTo(Employee o) {
        if (!this.hireDate.isEqual(o.hireDate)) {
            return  this.hireDate.compareTo(o.hireDate);
        }
        return (int)(this.salary - o.salary);
    }

    public Employee(String name, String eid, int age, char sex, LocalDate hireDate, double salary, String location) {
        this.name = name;
        this.eid = eid;
        this.age = age;
        this.sex = sex;
        this.hireDate = hireDate;
        this.salary = salary;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", eid='" + eid + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                '}';
    }


}
