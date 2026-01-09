package _enum;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/19 9:26
 * @Version 1.0
 */
public class Card {
    private final Suit suit;
    private final Rank rank;

    Card(Suit suit,Rank rank){
        this.rank = rank;
        this.suit = suit;
    }

    public String toString(){
        return suit.getSymbol() + "\t" + rank.getValue();
    }
}
