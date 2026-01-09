package _exception.exer2;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/25 11:41
 * @Version 1.0
 */
public class DivideTest {
    public static void main(String[] args) {
        try {
            double d1 = Double.parseDouble(args[0]);
            double d2 = Double.parseDouble(args[1]);
            if (d1 < 0 || d2 < 0)
                throw new BelowZeroException("The number that you input must be positive.");
            System.out.println(DivisionDemo.divide(d1,d2));
        } catch (BelowZeroException | NumberFormatException |
                 ArrayIndexOutOfBoundsException | ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
