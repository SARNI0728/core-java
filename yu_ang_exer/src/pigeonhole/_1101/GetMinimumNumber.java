package pigeonhole._1101;

import java.util.Scanner;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/1 12:53
 * @Version 1.0
 */
public class GetMinimumNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double d1 = s.nextDouble();
        double d2 = s.nextDouble();
        double d3 = s.nextDouble();
        double Num =  d1 > d2? Math.min(d2, d3) : Math.min(d1, d3);
        System.out.println("The minimum value among those u provided is ->" + Num);
    }
}
