package december.vii.getsum;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Even e = new Even();
        Odd o = new Odd();

        Thread even = new Thread(e);
        Thread odd = new Thread(o);

        even.start();
        odd.start();

        even.join();
        odd.join();

        System.out.println("res = " + (e.getResult() + o.getResult()));
    }
}
