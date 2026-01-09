package pigeonhole._1028.数组题;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/28 16:56
 * @Version 1.0
 */
//模拟抽取第1 5 50张扑克牌
public class Card2 {
    public static void main(String[] args) {
        String[] str = new String[4];
        str[0] = "黑桃";
        str[1] = "桃心";
        str[2] = "梅花";
        str[3] = "方片";

        final int CHOICE_NUM1 = 1;
        final int CHOICE_NUM2 = 5;
        final int CHOICE_NUM3 = 50;
        System.out.print(str[mapperSuit(CHOICE_NUM1)] + mapperNum(CHOICE_NUM1));
        System.out.print(str[mapperSuit(CHOICE_NUM2)] + mapperNum(CHOICE_NUM2));
        System.out.print(str[mapperSuit(CHOICE_NUM3)] + mapperNum(CHOICE_NUM3));

    }

    private static int mapperSuit(int num){
        //本方法的作用是输入数值来反应对应的花色。
        //假设第一张牌是黑桃A，第二张是黑桃2···第14张是梅花A
        //可得编号1 - 13为黑桃，14-26为桃心···
        return num/13;
    }
    private static String mapperNum(int num){
        //本方法的作用是输入数值来返回对应的字符串格式的卡牌数值。
        //假设第一张牌是黑桃A，第二张是黑桃2···第14张是梅花A
        //可得编号1，14皆映射为1····
        int cardNum = (num - 1)%13 + 1;
        if (cardNum == 1)
            return "A";
        if (cardNum == 11)
            return "J";
        if (cardNum == 12)
            return "Q";
        if (cardNum == 13)
            return "K";
        return Integer.toString(cardNum);
    }

}