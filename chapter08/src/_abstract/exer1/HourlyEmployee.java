package _abstract.exer1;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/28 20:11
 * @Version 1.0
 */
public class HourlyEmployee extends Employee{
    private double wage;
    private double hour;
    public double earnings(){
        return wage * hour;
    }
    public HourlyEmployee() {
    }

    public HourlyEmployee(double wage, double hour) {
        this.wage = wage;
        this.hour = hour;
    }

    public HourlyEmployee(String name, int number, MyDate birthday, double wage, double hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "Name = " + getName() +
                "\tNumber = " + getNumber() +
                "\tBirthday = " + getBirthday().toDateString() +
                "\twage=" + wage +
                "\thour=" + hour +
                '}';
    }
}
