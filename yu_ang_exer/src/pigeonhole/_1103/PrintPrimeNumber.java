package pigeonhole._1103;

import java.util.Scanner;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/3 21:49
 * @Version 1.0
 */
public class PrintPrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 2; i < n; i++) {
            if(n % i == 0) {
                System.out.println("不是素数");
                System.exit(0);
            }
        }
        System.out.println("是素数");
    }
}
