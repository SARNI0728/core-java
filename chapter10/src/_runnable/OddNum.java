package _runnable;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/30 16:53
 * @Version 1.0
 */
public class OddNum implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 1)
                System.out.println(Thread.currentThread().getName() + " -> Odd Number：" + i);
        }
    }
}
