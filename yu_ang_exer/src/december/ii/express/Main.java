package december.ii.express;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Queue<String> process = new LinkedList<>();
        process.add("货品已出库");
        process.add("上门收取快递");
        process.add("送到快递分包中心");
        process.add("货物正在运输···");
        process.add("货物已由快递员送到小区分配中心");
        process.add("货物已被取走");

        Worker wk1 = new Worker(1,process);
        Worker wk2 = new Worker(2,process);
        Worker wk3 = new Worker(3,process);

        Thread worker1 = new Thread(wk1);
        Thread worker2 = new Thread(wk2);
        Thread worker3 = new Thread(wk3);

        worker1.start();
        worker2.start();
        worker3.start();

        Thread.sleep(4);
        Thread customer = new Thread(() -> System.out.println("我是顾客线程，我现在查询到的是：" + process.peek()));
        customer.start();

    }
}
