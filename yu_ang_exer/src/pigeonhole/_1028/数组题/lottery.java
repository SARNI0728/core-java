package pigeonhole._1028.数组题;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/28 16:40
 * @Version 1.0
 */
public class lottery {
    public static void main(String[] args) {
        int[] arr = new int[10]; //保存中奖序列
        System.out.println("您的大乐透号码为：");
        for (int i = 0; i < 10; i++) {
            arr[i] = (int)(Math.random() * 99) + 1;
            System.out.print(arr[i] + "\t");
        }
    }
}
