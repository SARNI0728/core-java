package pigeonhole._1104;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/4 21:46
 * @Version 1.0
 */
public class PrintYangHuiTriangle {
    public static void main(String[] args) {
        int[][] x = new int[20][20];
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == i || j == 1) {
                    x[i][j] = 1;
                    System.out.print(x[i][j] + "\t");
                    continue;
                }
                x[i][j] = x[i - 1][j - 1] + x[i - 1][j];
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
