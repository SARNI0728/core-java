import java.util.HashSet;
import java.util.Random;

/**
    Description:
    @Author SArNi
    @Create 2025/11/3 21:00
    @Version 1.0
*/
public class Exercise4 {
    public static void main(String[] args) {
        Random r = new Random();
        HashSet set = new HashSet();

        while (true){
            set.add(r.nextInt(20) + 1);
            System.out.println(set);
            if(set.size() == 10)
                break;
        }
    }
}
