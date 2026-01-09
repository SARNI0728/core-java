package _thread;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/29 21:41
 * @Version 1.0
 */
public class EvenNum extends Thread{
    @Override
    public void run(){
        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 0)
                System.out.println("Even Number：" + i);
        }
    }
}
