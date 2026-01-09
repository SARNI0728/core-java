package pigeonhole._1104;

import java.util.HashSet;
import java.util.Random;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/4 21:21
 * @Version 1.0
 */
public class UnionLotto {
    public static void main(String[] args) {
        Random r = new Random();
        HashSet<Integer> integers = new HashSet<>();

        while(integers.size() <= 7){
            if(integers.size() == 7){
                integers.add(r.nextInt(16) + 1);
                break;
            }
            integers.add(r.nextInt(33) + 1);
        }

        System.out.println("本次开奖结果为：");
        for(Integer i : integers){
            System.out.print(i + "\t");
        }
    }
}
