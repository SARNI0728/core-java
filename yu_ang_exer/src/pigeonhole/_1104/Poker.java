package pigeonhole._1104;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/4 21:36
 * @Version 1.0
 */
public class Poker {


    public static void main(String[] args) {
        String[] nums = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] suits = {"黑桃", "桃心", "梅花", "方片"};
        String[][] pokers = new String[4][13];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                pokers[i][j] = suits[i] + nums[j];
                System.out.print(pokers[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
