import java.util.*;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/3 20:38
 * @Version 1.0
 */
public class Exercise3 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(7);
        list.add(2);
        list.add(1);
        list.add(7);
        list.add(2);
        list.add(8);
        list.add(5);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println(duplicateList(list));
    }
    public static List duplicateList(List list){
        Iterator iterator = list.iterator();
        HashSet hashset = new HashSet();
        while(iterator.hasNext()){
            hashset.add(iterator.next());
        }
        ArrayList a = new ArrayList();
        a.addAll(hashset);
        return a;
    }
}
