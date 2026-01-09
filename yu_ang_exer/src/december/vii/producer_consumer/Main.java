package december.vii.producer_consumer;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Thread producer1 = new Thread(new Producer(storage,1));
        Thread producer2 = new Thread(new Producer(storage,2));
        Thread producer3 = new Thread(new Producer(storage,3));
        Thread consumer = new Thread(new Consumer(storage));

        producer1.start();
        producer2.start();
        producer3.start();
        consumer.start();
    }
}
