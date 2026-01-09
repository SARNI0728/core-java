package _thread;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/29 21:45
 * @Version 1.0
 */
public class OddNum extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("Odd Number：" + i);
        }
    }
}
