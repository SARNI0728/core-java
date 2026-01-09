package _enum;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/19 9:35
 * @Version 1.0
 */
public class Deck {
    private int pointer;
    private Card[] cards;
    Deck(){
        System.out.println("真实荷官在线发牌，欢迎使用津州扑克！");
        cards = new Card[52];
        Suit[] all_suits = Suit.values();
        Rank[] all_ranks = Rank.values();
        for(int i = 0;i < Suit.values().length;i++){
            for(int j = i * Rank.values().length; j < Rank.values().length * (i + 1);j++){
                cards[j] = new Card(all_suits[i],all_ranks[j % 13]);
            }
        }
    }
    public void shuffle(){
        //打乱发牌的顺序，本质上是对cards数组进行一次随机重新排序
        //并且让发牌指针归零
        Card buffer;
        for(int i = 0; i < 1000 ; i++){ //随机交换牌1000次
            int r1 = (int)(Math.random() * 52);
            int r2 = (int)(Math.random() * 52);
            buffer = cards[r1];
            cards[r1] = cards[r2];
            cards[r2] = buffer;
        }
        pointer = 0;
    }
    public Card dealCard(){ //发一张牌
        if(pointer + 1 == 53)
            return null;
        return cards[pointer++];
    }
    public int cardsLeft(){
        return 52 - pointer + 1;
    }
}
