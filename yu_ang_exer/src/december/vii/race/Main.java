package december.vii.race;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Hare h =  new Hare();
        Tortoise t = new Tortoise();

        Thread hare = new Thread(h);
        Thread tortoise = new Thread(t);

        System.out.println("起跑！");
        hare.start();
        tortoise.start();

        hare.join();
        tortoise.join();

    }
}
