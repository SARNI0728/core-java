package exer;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/30 20:45
 * @Version 1.0
 */
public class Exercise2 {
    public static void main(String[] args) {
        Exercise2 e2 = new Exercise2();
        TopUp t = e2.new TopUp();

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);

        t1.start();
        t2.start();
        t3.start();
    }

    private class TopUp implements Runnable{
        static double balance;

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                balance += 1;
                System.out.println(Thread.currentThread().getName()  + "-> The current balance of the account:" + balance);
            }
        }
    }
}
