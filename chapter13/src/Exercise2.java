import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/4 18:22
 * @Version 1.0
 */
public class Exercise2 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            integers.add(r.nextInt(100));
        }
        for(Integer i : integers){
            System.out.println("整数:" + i);
        }
        integers.removeIf(num -> num % 2 == 0);
        Iterator<Integer> iterator = integers.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }
}
