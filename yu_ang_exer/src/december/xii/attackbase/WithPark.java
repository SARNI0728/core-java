package december.xii.attackbase;

import static java.util.concurrent.locks.LockSupport.park;
import static java.util.concurrent.locks.LockSupport.unpark;

public class WithPark {
    static Thread TrainSoldier;
    static Thread AttackBase;

    public static void main(String[] args) {
        Thread TrainSoldier = new Thread(() -> {
            park();
            System.out.println("Kirov reporting.");
            unpark(AttackBase);
        });

        AttackBase = new Thread(() -> {
            park();
            System.out.println("Closing on target.");
        });


        AttackBase.start();
        TrainSoldier.start();

        unpark(TrainSoldier);
    }

}
