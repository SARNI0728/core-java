package december.xii.buyticket;
/*使用线程池完成12306抢票处理。有10张北京去上海的火车票，模拟30个人抢票，用10个线程完成处理，买票的过程如下：
如果成功买到票，将票数减少，并显示旅客名+”已成功买票”，还剩xx张，如果没有买到票，则提示抢票失败*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        String[] names = new String[30]; //生成30个人名
        for (int i = 0; i < 30; i++) {
            names[i] = String.valueOf((char)(97 + i));
        }

        for (int i = 0; i < 30; i++) {
            executorService.submit(new PurchaseTicket(names[i]));
        }
    }
}
