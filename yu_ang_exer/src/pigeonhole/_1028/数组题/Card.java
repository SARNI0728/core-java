package pigeonhole._1028.数组题;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/28 16:46
 * @Version 1.0
 */
public class Card {
    public static void main(String[] args) {
        String[] str = new String[4];
        str[0] = "黑桃";
        str[1] = "梅花";
        str[2] = "桃心";
        str[3] = "方片";

        String tempString; //用于存储临时的字符串

        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                tempString = Integer.toString(j);
                if (j == 1)
                    tempString = "A";
                if (j == 11)
                    tempString = "J";
                if (j == 12)
                    tempString = "Q";
                if (j == 13)
                    tempString = "K";
                System.out.print(str[i] + tempString + "\t");
            }
            System.out.println("\n");
        }
    }
}
