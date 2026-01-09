package december.xii.buyticket;

import static java.lang.Thread.sleep;

public class PurchaseTicket implements Runnable{
    static int TicketCount = 10; // 总共有10张车票

    String passengerName;

    public PurchaseTicket(String passengerName) {
        this.passengerName = passengerName;
    }

    @Override
    public void run() {
        try {
            sleep((long) (Math.random() * 501)); //模拟网络延迟
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (PurchaseTicket.class){
            if(TicketCount > 0){
                System.out.println(passengerName + "购买了一张车票！" + "当前还剩下" + TicketCount + "张");
                TicketCount--;
            }else
                System.out.println(passengerName + "运气不好，没有抢到");
        }
    }
}
