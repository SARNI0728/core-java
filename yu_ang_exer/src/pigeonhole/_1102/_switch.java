package pigeonhole._1102;

import java.util.Scanner;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/2 13:05
 * @Version 1.0
 */
public class _switch {
    public static void main(String[] args) {
        switch (new Scanner(System.in).nextInt() / 10){
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("E");
        }
    }
}
