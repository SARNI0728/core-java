package december.vii.race;

import java.util.Random;

public class Tortoise implements Runnable {
    int totalDistance = 0;
    Random rand = new Random();
    @Override
    public void run() {
        while (true) {
            if(totalDistance >= 100){
                System.out.println("乌龟到终点了！");
                break;

            }
            totalDistance = totalDistance + rand.nextInt(3) + 1;
            System.out.println("乌龟现在跑了 " + totalDistance + "米了！" );
        }
    }

}
