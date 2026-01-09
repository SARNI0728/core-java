package pigeonhole._1104;

import java.util.HashSet;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/4 21:30
 * @Version 1.0
 */
public class DeRepetition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 1, 3, 5, 6, 9, 5};
        HashSet<Integer> integers = new HashSet<>();
        for(Integer i : arr){
            integers.add(i);
        }
        System.out.println(integers);
    }
}
