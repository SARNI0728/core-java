package december.ii.express;

import java.util.Queue;

public class Worker implements Runnable {
    Queue<String> process;

    int workerId;
    public Worker(int workerId, Queue<String> process) {
        this.workerId = workerId;
        this.process = process;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (process) {
                if(process.isEmpty()) {
                    process.notifyAll();
                    break;
                }

                while (!isMyJob(process.peek(),workerId)) {
                    try {
                        process.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    if (process.isEmpty()) {
                        process.notifyAll();
                        break;
                    }
                }

                if(isMyJob(process.peek(),workerId)) {
                    System.out.println(workerId + "完成" + process.poll());
                    process.notifyAll();
                }
            }
        }
    }

    public boolean isMyJob(String currentJob,int workerId) {
        if(currentJob != null){
            if(workerId == 1 && (currentJob.equals("货品已出库") || currentJob.equals("上门收取快递")))
                return true;
            else if(workerId == 2 && (currentJob.equals("送到快递分包中心") || currentJob.equals("货物正在运输···")))
                return true;
            else return workerId == 3 && (currentJob.equals("货物已由快递员送到小区分配中心") || currentJob.equals("货物已被取走"));
        }
        return false;
    }
}
