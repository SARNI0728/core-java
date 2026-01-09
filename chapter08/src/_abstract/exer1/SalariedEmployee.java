package _abstract.exer1;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/28 20:02
 * @Version 1.0
 */
public class SalariedEmployee extends Employee{
    private double monthlySalary;
    SalariedEmployee(){
    }

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    public double earnings(){
        return monthlySalary;
    }

    @Override
    public String toString() {
        return  "SalariedEmployee{" +
                "Name = " + getName() +
                "\tNumber = " + getNumber() +
                "\tBirthday = " + getBirthday().toDateString() +
                "\tMonthlySalary=" + monthlySalary +
                '}';
    }
}
