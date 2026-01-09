package pigeonhole._1102;

import java.util.Scanner;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/2 13:16
 * @Version 1.0
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.println("输入两个整数");
        Scanner s = new Scanner(System.in);
        double op1 = s.nextDouble();
        double op2 = s.nextDouble();
        double res;
        System.out.print(op1 + "+" + op2 + "=");
        res = op1 + op2;
        if(res - (int)res == 0)
            System.out.println((int)res);
        else
            System.out.println(res);
    }
}
