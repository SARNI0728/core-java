package _enum;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/19 10:40
 * @Version 1.0
 */
public class DeckTest {
    public static void main(String[] args) {
        Deck d = new Deck();
        d.shuffle();
        System.out.println("发牌中···");
        for (int i = 0; i < 52;i++) {
            System.out.println(d.dealCard());
        }
    }
}
