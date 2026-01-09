package december.xii.purchase;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class purchase {
    static int point;
    static final ReentrantLock LOCK = new ReentrantLock();
    static final Condition COND = LOCK.newCondition();
    static int currentThreadId = 0;
    static int PURCHASE_COUNT = 3; // 需要购买的数量
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            final int threadId = 0;
            @Override
            public void run() {
                for(int i = 0; i < PURCHASE_COUNT; i++) {

                    LOCK.lock();
                    while (threadId != currentThreadId) {
                        try {
                            COND.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("正在挑选商品···");
                    currentThreadId = 1;
                    COND.signalAll();
                    LOCK.unlock();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            final int threadId = 1;
            @Override
            public void run() {
                for(int i = 0; i < PURCHASE_COUNT; i++) {
                    LOCK.lock();
                    while(threadId != currentThreadId) {
                        try {
                            COND.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("正在使用微信付款");
                    System.out.println("付款成功！ 积分加100");
                    point+=100;
                    currentThreadId = 2;
                    COND.signalAll();
                    LOCK.unlock();
                }
            }
        });
        Thread t3 = new Thread(new Runnable() {
            final int threadId = 2;
            @Override
            public void run() {
                for(int i = 0; i < PURCHASE_COUNT; i++) {
                    LOCK.lock();
                    while(threadId != currentThreadId) {
                        try {
                            COND.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("当前积分：" + point);
                    currentThreadId = 0;
                    COND.signalAll();
                    LOCK.unlock();
                }
            }
        });


        t1.start();
        t2.start();
        t3.start();
    }
}
