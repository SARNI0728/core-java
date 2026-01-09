package december.vii.getsum;
// 本线程负责程序1到1000的奇数的加法
public class Odd implements Runnable {
    private int result;
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i+=2) {
            result += i;
        }
    }
    public int getResult() {
        return result;
    }
}
