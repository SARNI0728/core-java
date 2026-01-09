package december.iv;

import java.time.LocalDate;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GetEmployeeInfo {
    public static void main(String[] args) {
        Employee e1 = new Employee("李白","I1032",25,'M',
                LocalDate.of(2021,12,20),
                10000,"吉林省长春市","项目部");
        Employee e2 = new Employee("杜甫","C1048",30,'F',
                LocalDate.of(2017,10,10),
                12000,"江苏省南京市","研发部");
        Employee e3 = new Employee("白居易","C1052",30,'M',
                LocalDate.of(2019,5,22),
                15000,"江苏省苏州市","研发部");
        Employee e4 = new Employee("李清照","C1035",31,'F',
                LocalDate.of(2015,4,12),
                14000,"吉林省吉林市","研发部");
        Employee e5 = new Employee("陆游","P1066",40,'M',
                LocalDate.of(2009,6,15),
                8000,"吉林省长春市","产品部");
        Employee e6 = new Employee("贺知章","P1088",35,'M',
                LocalDate.of(2012,3,30),
                16000,"上海市","产品部");

        /*按照上述数据，公司设立了哪些部门
                获取入职日期最早的员工信息
        计算研发部门的总工资数和平均工资数
        获取所有姓李的员工，计算人数
        将所有员工按年龄进行升序排列，年龄相同，按工资升序排列
                将所有员工按入职日期降序排列
        将员工按姓名长度进行分组，2个字符的一组，3个字符的一组
        将所有产品部门工资不足10000的员工，加薪1000元
        返回所有员工的编号，按字母顺序升序排列
        获取所有员工姓名，得到一个字符串数组*/

        //按照上述数据，公司设立了哪些部门
        Stream.of(e1,e2,e3,e4,e5,e6).map(Employee :: getDepartment).distinct().forEach(System.out::println);

        //获取入职日期最早的员工信息
        System.out.println(Stream.of(e1, e2, e3, e4, e5, e6).min((emp1, emp2) -> emp1.getHireDate().compareTo(emp2.getHireDate())));

        //计算研发部门的总工资数和平均工资数
        DoubleSummaryStatistics stats = Stream.of(e1, e2, e3, e4, e5, e6).filter(e -> e.getDepartment().equals("研发部")).mapToDouble(Employee::getSalary).summaryStatistics();;
        double avgSalary = stats.getAverage();
        double sumSalary = stats.getSum();
        System.out.println("研发部门的平均工资：" + avgSalary + ", 总计工资：" + sumSalary);

        //获取所有姓李的员工，计算人数
        System.out.println(Stream.of(e1, e2, e3, e4, e5, e6).filter(e -> e.getName().startsWith("李")).count());

        //将所有员工按年龄进行升序排列，年龄相同，按工资升序排列
        Stream.of(e1, e2, e3, e4, e5, e6).sorted((emp1,emp2) -> {
            if(emp1.getAge()  ==  emp2.getAge())
                return (int)(emp1.getSalary() -  emp2.getSalary());
            return emp1.getAge()  - emp2.getAge();
        }).forEach(System.out::println);

        System.out.println();

        //将所有员工按入职日期降序排列
        Stream.of(e1, e2, e3, e4, e5, e6).sorted((emp1,emp2) -> -emp1.getHireDate().compareTo(emp2.getHireDate())).forEach(System.out::println);

        //将员工按姓名长度进行分组，2个字符的一组，3个字符的一组
        Map<Integer, List<Employee>> collect = Stream.of(e1, e2, e3, e4, e5, e6).collect(Collectors.groupingBy(e -> e.getName().length()));

        System.out.println(collect.get(2));
        System.out.println(collect.get(3));

        //将所有产品部门工资不足10000的员工，加薪1000元
        Stream.of(e1, e2, e3, e4, e5, e6).filter(e -> e.getSalary() < 10000).forEach(e -> {
            System.out.println("员工：" + e.getName() + " 当前工资为不足10000元，现决定加薪1000元");
            e.setSalary(e.getSalary() + 1000);
            System.out.println("加薪后工资为：" + e.getSalary());
        });

        //返回所有员工的编号，按字母顺序升序排列
        Stream.of(e1, e2, e3, e4, e5, e6).map(Employee::getEid).sorted(String::compareTo).forEach(System.out::println);

        //获取所有员工姓名，得到一个字符串数组
        String[] array = Stream.of(e1, e2, e3, e4, e5, e6).map(Employee::getName).toArray(String[] :: new);
        for(String s: array){
            System.out.println(s);
        }
    }
}
