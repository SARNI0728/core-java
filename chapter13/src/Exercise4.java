import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/5 14:10
 * @Version 1.0
 */
public class Exercise4 {
    /*
    * 编写一个泛型方法，接收一个任意引用类型的数组，并反转数组中的所有元素
    */
    public static <E> void method2( E[] e){
        ArrayList<E> es = new ArrayList<>(Arrays.asList(e));
        Collections.reverse(es);
        System.out.println(es);
    }

    public static void main(String[] args) {
        String[] strings= {"LYN","LSX","GZL","ZHZ"};
        method2(strings);
    }
}
