package november.fifth;

import java.util.Random;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/5 20:39
 * @Version 1.0
 */
public class GetLottery {
    public static void main(String[] args) {
        GetLotteryMethod("5D",5);
    }
    public static void GetLotteryMethod(String type, int amount) {
        Random r = new Random();
        int loopCount = 0; //控制每一行输出的数量
        if (type.equals("3D")) {
            loopCount = 3;
        } else if (type.equals("5D")) {
            loopCount = 5;
        }
        System.out.println("你的彩票号码：");
        for (int i = 0; i < amount; i++) {
            System.out.println("第" + i + "注：");
            for (int j = 0; j < loopCount; j++) {
                System.out.print(r.nextInt(10) + "\t");
            }
            System.out.println();
        }
    }
}
