package pigeonhole._1102;

import java.util.Scanner;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/2 13:02
 * @Version 1.0
 */
public class _ifelse {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        if(num % 3 == 0 && num % 5 == 0)
            System.out.println("乒乓");
        else if(num % 3 == 0)
            System.out.println("乒");
        else if(num % 5 == 0)
            System.out.println("乓");
        else
            System.out.println(num);
    }
}
