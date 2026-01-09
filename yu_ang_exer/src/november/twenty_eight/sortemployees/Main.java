package november.twenty_eight.sortemployees;

import java.time.LocalDate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
    Employee e1 = new Employee("李白","T1032",25,'M',
                LocalDate.of(2021,12,20),
                10000,"吉林省长春市");
    Employee e2 = new Employee("杜甫","C1048",30,'F',
            LocalDate.of(2017,10,10),
            12000,"江苏省南京市");
    Employee e3 = new Employee("白居易","C1052",28,'M',
            LocalDate.of(2019,5,22),
            15000,"江苏省苏州市");
    Employee e4 = new Employee("李清照","T1035",31,'F',
            LocalDate.of(2015,4,12),
            14000,"吉林省吉林市");
    Employee e5 = new Employee("陆游","C1066",40,'M',
            LocalDate.of(2009,6,15),
            10000,"吉林省长春市");
    Employee e6 = new Employee("贺知章","C1088",35,'M',
            LocalDate.of(2012,3,30),
            16000,"上海市");

    Stream.of(e1,e2,e3,e4,e5,e6).sorted().limit(3).forEach(System.out::println);
    }

}
