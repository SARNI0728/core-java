package november.twenty_three.employeetest;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("李白","T1032",1,25,
                LocalDate.of(2021,12,20),
                10000,"吉林省长春市");
        Employee e2 = new Employee("杜甫","C1048",0,30,
                LocalDate.of(2017,10,10),
                12000,"江苏省南京市");
        Employee e3 = new Employee("白居易","C1052",1,28,
                LocalDate.of(2019,5,22),
                15000,"江苏省苏州市");
        Employee e4 = new Employee("李清照","T1035",0,31,
                LocalDate.of(2015,4,12),
                14000,"吉林省吉林市");
        Employee e5 = new Employee("陆游","C1066",1,40,
                LocalDate.of(2009,6,15),
                10000,"吉林省长春市");
        Employee e6 = new Employee("贺知章","C1088",1,35,
                LocalDate.of(2012,3,30),
                16000,"上海市");
        /*财务部门要求分别统计测试部门和研发部门的工资总额和平均工资
        人事部门决定撤消上海市办公地点，所有上海市员工解散
        人事部门对于工作时间超过70个月的员工，上调薪资百分之十*/
        Predicate<Employee> isTestDepartment = employee -> employee.id.startsWith("T");
        Predicate<Employee> isResearchDepartment = employee -> employee.id.startsWith("C");
        Double testDepartmentSumSalary = Stream.of(e1, e2, e3, e4, e5, e6).filter(isTestDepartment).collect(Collectors.summingDouble(Employee::getSalary));
        Double testDepartmentAvgSalary = Stream.of(e1, e2, e3, e4, e5, e6).filter(isTestDepartment).collect(Collectors.averagingDouble(Employee::getSalary));
        Double researchDepartmentSumSalary = Stream.of(e1, e2, e3, e4, e5, e6).filter(isResearchDepartment).collect(Collectors.summingDouble(Employee::getSalary));
        Double researchDepartmentAvgSalary = Stream.of(e1, e2, e3, e4, e5, e6).filter(isResearchDepartment).collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println("testDepartmentSumSalary = " + testDepartmentSumSalary);
        System.out.println("testDepartmentAvgSalary = " + testDepartmentAvgSalary);
        System.out.println("researchDepartmentSumSalary = " + researchDepartmentSumSalary);
        System.out.println("researchDepartmentAvgSalary = " + researchDepartmentAvgSalary);
        ArrayList<Employee> employees = new ArrayList<>(List.of(e1, e2, e3, e4, e5, e6));
        System.out.println("employees = " + employees);
        employees.removeIf(e -> e.getLocation().equals("上海市"));
        System.out.println(employees);
        for(var e : employees){
            int monthCount = (int)ChronoUnit.MONTHS.between(e.hireDate, LocalDate.now());
            System.out.println("该员工为员工工作了" + monthCount + "个月");
            if(monthCount >= 70){
                e.setSalary(e.getSalary()*1.1);
                System.out.println("工资已上调1.1倍：" + e.getSalary());
            }
        }
    }
}
