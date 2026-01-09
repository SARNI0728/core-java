package december.vii.redalert;

import static java.lang.Thread.sleep;

public class Main {
    static final Object lock = new Object();
    static int currentThreadId = 1;

    public static boolean isMineThread(int threadId) {
        return threadId == currentThreadId;
    }

    public static void main(String[] args) throws InterruptedException {


        Thread produceSoldier = new Thread(() -> {
            int soldierCount = 0;

            try {
                synchronized (lock) {
                    while (soldierCount < 5) {
                        while (!isMineThread(1))
                            lock.wait();
                        System.out.println("Training···");
                        sleep(3000);
                        System.out.println("Unit Ready.");
                        System.out.println("Conscript reporting.");
                        soldierCount++;
                        currentThreadId = 2;
                        lock.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread moveSoldier = new Thread(() -> {
            synchronized (lock) {
                while(true) {
                    while (!isMineThread(2)) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println("脖子右拧！");
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("拉起攻击进程···");
                    currentThreadId = 3;
                    lock.notifyAll();
                }
            }
        });


        Thread attackTower = new Thread(() -> {
            int towerHP = 100;
            try {
                synchronized (lock) {
                    while(towerHP > 0){
                    while (!isMineThread(3))
                        lock.wait();

                    System.out.println("Ready to strike!");
                        sleep(1000);
                        towerHP -= 20;
                        if(towerHP <= 0){
                            System.out.println("You are victorious.");
                            System.exit(0);
                        }
                        System.out.println("当前防御塔剩余血量：" + towerHP);
                        currentThreadId = 1;
                        lock.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        produceSoldier.start();
        moveSoldier.start();
        attackTower.start();

        produceSoldier.join();
        moveSoldier.join();
        attackTower.join();
    }
}
