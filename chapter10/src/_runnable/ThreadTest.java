package _runnable;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/30 16:54
 * @Version 1.0
 */
public class ThreadTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    System.out.println("Number:" + i);
                }
            }
        }).start();
    }
}
