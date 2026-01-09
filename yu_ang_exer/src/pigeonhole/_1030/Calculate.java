package pigeonhole._1030;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/30 21:25
 * @Version 1.0
 */
public class Calculate {
    public static void main(String[] args) {
        double res = 1;
        for (int i = 2; i < 100; i++) {
            if(i%2 == 0)
                res -= 1/(double)i;
            if(i%2 == 1)
                res += 1/(double)i;
        }
        System.out.println(res);
    }
}
