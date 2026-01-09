package december.vii.getsum;

public class Even implements Runnable {
    private int result;
    @Override
    public void run() {
        for (int i = 0; i <= 1000; i+=2) {
            result += i;
        }
    }
    public int getResult() {
        return result;
    }
}
