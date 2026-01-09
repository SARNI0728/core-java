import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/1 15:04
 * @Version 1.0
 */
public class Trans {
    public static void main(String[] args) throws Exception{
        java.sql.Date d = new java.sql.Date(
        new SimpleDateFormat("yy-MM-dd")
                .parse(new Scanner(System.in).nextLine()).getTime()
        );
        System.out.println(d.getTime());
    }
}
