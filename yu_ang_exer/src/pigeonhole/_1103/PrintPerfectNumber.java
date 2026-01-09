package pigeonhole._1103;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/4 8:57
 * @Version 1.0
 */
public class PrintPerfectNumber {
    public static void main(String[] args) {
        int tempSum; //计算每个数字真因子的和
        for (int i = 1; i <= 100; i++) {
            tempSum = 0;
            for (int j = 1; j < i; j++) {
                if(i % j == 0)
                    tempSum += j;
            }
            if(i - tempSum == 0)
                System.out.println("完数：" + i);
        }
    }
}
