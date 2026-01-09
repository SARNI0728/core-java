package december.xii.purchase;

import static java.util.concurrent.locks.LockSupport.park;
import static java.util.concurrent.locks.LockSupport.unpark;

public class WithPark {
    static Thread t1;
    static Thread t2;
    static Thread t3;
    static int point = 0;

    public static void main(String[] args) {
        t1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                park();
                System.out.println("正在挑选商品···");
                unpark(t2);
            }
        });
        t2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                park();
                System.out.println("正在购买商品,积分加100");
                point+=100;
                unpark(t3);
            }
        });
        t3 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                park();
                System.out.println("当前积分：" + point);
                unpark(t1);
            }
        });

        t1.start();
        t2.start();
        t3.start();

        unpark(t1);
    }
}
