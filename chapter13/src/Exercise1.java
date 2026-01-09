import java.time.LocalDate;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/4 17:43
 * @Version 1.0
 */
public class Exercise1 {
    public static void main(String[] args) {
        Employee e1 = new Employee("LYN", 24, LocalDate.of(2001, 7, 28));
        Employee e2 = new Employee("LSX", 23, LocalDate.of(2002, 7, 21));
        Employee e3 = new Employee("GZL", 25, LocalDate.of(2003, 10, 15));
        Employee e4 = new Employee("GXT", 20, LocalDate.of(2004, 1, 15));
        //方式1： 使用comparable接口
//        TreeSet<Employee> employees = new TreeSet<>();
//        employees.add(e1);
//        employees.add(e2);
//        employees.add(e3);
//        employees.add(e4);
//        System.out.println(employees);
        TreeSet<Employee> employees = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1 == o2)
                    return 0;
                return o1.getBirthDay().compareTo(o2.getBirthDay());
            }
        });
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        System.out.println(employees);

    }
}
