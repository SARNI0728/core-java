package pigeonhole._1103;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/4 9:21
 * @Version 1.0
 */
public class PrintStarSign {
    public static void main(String[] args) {
        final int STAR_SIZE = 7;
        for (int i = 1; i <= STAR_SIZE; i++) {
            for (int j = 1; j <= STAR_SIZE; j++) {
                if (i == Math.ceil((double) STAR_SIZE / 2)) System.out.print("*");
                else if (j == Math.ceil((double) STAR_SIZE / 2)) System.out.print("*");
                else if (j == i || j == STAR_SIZE + 1 - i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
