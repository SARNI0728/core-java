package _abstract.exer1;

import java.util.Scanner;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/28 20:26
 * @Version 1.0
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new HourlyEmployee("刘亚宁" ,728, new MyDate(2001,7,28), 300,8);
        employees[1] = new SalariedEmployee("刘沭萱" ,721, new MyDate(2002,7,21), 50000);
        System.out.println("输入当前月份");
        Scanner s = new Scanner(System.in);
        int month = s.nextInt();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
            double pay = employees[i].earnings();
            if(month == employees[i].getBirthday().getMonth() && employees[i] instanceof SalariedEmployee){
                System.out.println("员工" + employees[i].getName() + "过生日！" + "在基础工资上 + 100");
                pay += 100;
            }
            System.out.println("员工" + employees[i].getName()
            + "本月工资为：" + pay + "CNY");
        }
    }

}
