package december.xii.attackbase;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    static int currentThreadID = 0;
    private static final ReentrantLock LOCK = new ReentrantLock();
    private static final Condition COND = LOCK.newCondition();

    public static void main(String[] args) {

        Thread TrainSoldier = new Thread(new Runnable() {
            final int threadId = 0;
            @Override
            public void run() {
                LOCK.lock();
                try {
                    while(threadId != currentThreadID) {
                        try {
                            COND.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Kirov reporting.");
                    currentThreadID = 1;
                    COND.signalAll();
                }finally {
                    LOCK.unlock();
                }
            }
        });

        Thread AttackBase = new Thread(new Runnable() {
            final int threadId = 1;
            @Override
            public void run() {
                LOCK.lock();
                try {
                    while(threadId != currentThreadID) {
                        try {
                            COND.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Closing on target.");
                } finally {
                    LOCK.unlock();
                }
            }
        });


        AttackBase.start();
        TrainSoldier.start();
    }

}
