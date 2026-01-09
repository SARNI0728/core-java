package _enum;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/19 9:12
 * @Version 1.0
 */
public enum Suit {
    SPADES("♠"),
    HEARTS("♥"),
    CLUBS("♣"),
    DIAMONDS("♦");

    private final String symbol;
    private Suit(String symbol){
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
