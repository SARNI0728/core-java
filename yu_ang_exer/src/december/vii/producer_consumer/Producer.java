package december.vii.producer_consumer;

import static java.lang.Thread.sleep;

public class Producer implements Runnable {
    Storage storage;

    int id; //生产者id

    public Producer(Storage storage, int id) {
        this.storage = storage;
        this.id = id;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (storage) {
                while(storage.messageCount==storage.MAX_MESSAGE_COUNT) {
                    try {
                        storage.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } // while end
                storage.messageCount++; //若是不满，产品数量++
                System.out.println("生产者" + id +"生产了一个信息" + "当前有信息数量：" +  storage.messageCount);
                storage.notifyAll();
            }
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
