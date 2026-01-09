package pigeonhole._1104;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/4 21:14
 * @Version 1.0
 */
public class IsOrder {
    public static void main(String[] args) {
        int[] nums = {1, 5, 7 };
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] < 0) {
                System.out.println("数组无序");
                System.exit(0);
            }
        }
        System.out.println("数组有序");
    }
}
