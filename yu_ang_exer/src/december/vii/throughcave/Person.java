package december.vii.throughcave;

import static java.lang.Thread.sleep;

public class Person implements Runnable {
    static final Object caveLock = new Object();
    String name;
    Person(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        synchronized (caveLock) {
        System.out.println(name + "正在通过山洞！");
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + "出来了！");
        }
    }
}
