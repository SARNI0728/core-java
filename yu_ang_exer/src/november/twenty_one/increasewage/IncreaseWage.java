package november.twenty_one.increasewage;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.function.Predicate;

public class IncreaseWage {
    public static void main(String[] args) {
        HashMap<String, LocalDate> map = new HashMap<>();
        map.put("李白",LocalDate.of(2018,2,4));
        map.put("杜甫",LocalDate.of(2012,5,6));
        map.put("白居易",LocalDate.of(2014,4,10));
        map.put("陆游",LocalDate.of(2016,10,11));
        for(var entry : map.entrySet()){
            Predicate<LocalDate> surpass100Month = date -> ChronoUnit.MONTHS.between(date,LocalDate.now()) > 100;
            if(surpass100Month.test(entry.getValue())){
                System.out.println("员工：" + entry.getKey() + "入职超过100个月了！加工资1k");
                continue;
            }
            System.out.println("员工:"+ entry.getKey() + "入职时间还没超过100个月，继续努力！");
        }
    }
}
