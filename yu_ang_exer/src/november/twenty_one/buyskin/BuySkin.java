package november.twenty_one.buyskin;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
/*王者荣耀策划上线新英雄皮肤，需要1788点券，从9月2日起开始上线，
第一周购买，8折优惠，第2周购买，9折优惠，第2周以后，全价，4周后，皮肤下线。
现在有以下玩家，李白9月5日购买，李信 9月10日购买，白起 9月28日购买，李元芳10月10日购买，
分别显示玩家购买新皮肤的情况(购买时间，是否购买成功，所花点券)*/
public class BuySkin {
    static final double PRICE = 1788;
    public static void main(String[] args) {

        ArrayList<LocalDate> Dates = new ArrayList<>();
        Dates.add(LocalDate.of(2025,9,2));
        Dates.add(LocalDate.of(2025,9,5));
        Dates.add(LocalDate.of(2025,9,10));
        Dates.add(LocalDate.of(2025,9,28));
        Dates.add(LocalDate.of(2025,10,27));
        for (int i = 1; i < Dates.toArray().length; i++) {
            double purchasePrice = 1788;
            long week = ChronoUnit.WEEKS.between(Dates.get(0), Dates.get(i));
            switch ((int) week){
                case 0:
                    purchasePrice = PRICE * 0.8;
                    break;
                case 1:
                    purchasePrice = PRICE * 0.9;
            }
            System.out.print("玩家" + i + "准备在" + Dates.get(i) + "购买皮肤，");
            if(week >= 4){
                System.out.println("皮肤已经下架，没买到。");
                continue;
            }
            System.out.println("买到了！花了" + purchasePrice + "点券。");
        }

    }


}
