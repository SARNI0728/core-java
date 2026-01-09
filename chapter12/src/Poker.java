/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/4 15:09
 * @Version 1.0
 */
public class Poker {
    static String[] nums = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    static String[] colors = {"黑桃","梅花","桃心","方片"};
    private static Poker[][] pokers = new Poker[5][13];

    static {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                pokers[i][j] = new Poker(nums[j],colors[i]);
            }
        }
        pokers[4][0] = new Poker("","大王");
        pokers[4][1] = new Poker("","小王");
    }
    String num; //这张牌对应的数值
    String color;//这张牌对应的花色
    Poker(){
    }
    Poker(String num , String color){
        this.num = num;
        this.color = color;
    }

    public static Poker[][] getPoker(){
        return Poker.pokers;
    }

    @Override
    public String toString(){
        return color + num;
    }
}
