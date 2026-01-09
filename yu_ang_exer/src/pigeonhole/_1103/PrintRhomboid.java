package pigeonhole._1103;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/4 9:04
 * @Version 1.0
 */
public class PrintRhomboid {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 30; j++) {
                if(i > 1 && i < 5 && j > 1 && j < 30){
                    System.out.print(" ");
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
