package november.twenty_one.getday;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class GetDay {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2001,7,28);
        long days = ChronoUnit.DAYS.between(birthday, today);
        System.out.println("活了" + days + "天了");
    }
}
