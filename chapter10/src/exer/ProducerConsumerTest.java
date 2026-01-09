package exer;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/31 10:10
 * @Version 1.0
 */

public class ProducerConsumerTest {
    public static void main(String[] args) {
        Clerk c = new Clerk();
        ProducerConsumerTest t = new ProducerConsumerTest();
        Producer pro1 = t.new Producer(c);
        Consumer con1 = t.new Consumer(c);

        Thread t1 = new Thread(pro1);
        Thread t2 = new Thread(con1);
        t1.start();
        t2.start();
    }
private static class Clerk{
    private static int produceNum;
    private static final int MAX_PRODUCE = 20;
    private static final int MIN_PRODUCE = 1;
    public synchronized void addProduct(){
        if(produceNum < MAX_PRODUCE){
            System.out.println("生产了第" + ++produceNum +"个产品。");
            notifyAll();
            try {
                wait(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public synchronized void consumeProduct(){
        if(produceNum >= MIN_PRODUCE){
            System.out.println("消费了第" + produceNum-- +"个产品。");
            notifyAll();
            try {
                wait(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

private class Producer implements Runnable{
    private final Clerk clerk;
    public Producer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true){
            System.out.println("生产者正在生产产品...");
            clerk.addProduct();
        }
    }
}

private class Consumer implements Runnable{
    private Clerk clerk;
    Consumer(Clerk clerk){
        this.clerk = clerk;
    }
    @Override
    public void run() {
        while(true){
            System.out.println("消费者正在消费产品...");
            clerk.consumeProduct();
        }
    }
}

}
