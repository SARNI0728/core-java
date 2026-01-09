package exer;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/30 20:36
 * @Version 1.0
 */
public class Exercise1 {
    public static void main(String[] args) {
        ReverseCount r = new ReverseCount();
        Thread t1 = new Thread(r);
        t1.start();
    }
    private static class ReverseCount implements Runnable{
        @Override
        public void run() {
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Happy New Year!");
        }
    }
}


