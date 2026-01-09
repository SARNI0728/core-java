package pigeonhole._1029;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/29 9:36
 * @Version 1.0
 */
public class _factorial {
    private static long factorial(int n){
        if(n < 2)
            return 2;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}
