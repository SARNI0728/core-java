package pigeonhole._1103;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/3 21:54
 * @Version 1.0
 */
public class PrintPrimeNumberRangeIn100 {
    public static void main(String[] args) {
        int tag;
        for (int i = 1; i < 100; i++) {
            tag = 1;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    tag = 0;
                    break;
                }
            }
            if(tag == 1)
                System.out.println("素数：" + i + "\t");
        }
    }
}
