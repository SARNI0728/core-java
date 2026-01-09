package _thread;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/29 21:46
 * @Version 1.0
 */
public class ThreadTest {
    public static void main(String[] args) {
        EvenNum e = new EvenNum();
        OddNum o = new OddNum();
        e.start();
        o.start();
    }
}
