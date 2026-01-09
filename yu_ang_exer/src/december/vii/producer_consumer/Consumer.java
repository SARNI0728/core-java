package december.vii.producer_consumer;

import static java.lang.Thread.sleep;

public class Consumer implements Runnable {
    Storage storage;
    public Consumer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (storage) {
                while(storage.messageCount == 0) {
                    try {
                        storage.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                storage.messageCount--;
                System.out.println("消费者消费了一个消息" + "当前有信息数量：" + storage.messageCount);
                storage.notifyAll();
            }
        }
    }

}
