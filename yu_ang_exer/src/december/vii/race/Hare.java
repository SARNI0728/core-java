package december.vii.race;

import java.util.Random;

import static java.lang.Thread.sleep;

public class Hare implements Runnable {
    int totalDistance = 0;
    int tag = 1;
    Random rand = new Random();
    @Override
    public void run() {
        while (true) {
            if(totalDistance >= 100){
                System.out.println("兔子到终点了！");
                break;
            }

            totalDistance = totalDistance + rand.nextInt(3) + 3;
            if(totalDistance >= 70 && tag == 1) {
                try {
                    sleep(2);
                    tag = 0;
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("兔子现在跑了 " + totalDistance + "米了！" );
        }
    }
}
