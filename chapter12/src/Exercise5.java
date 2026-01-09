import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/4 12:23
 * @Version 1.0
 */
public class Exercise5 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("Showtek", "Booyah");
        map.put("周杰伦", "回到过去");
        map.put("Deca joins", "夜间独白");
        System.out.println(map);

        //阶段2： 实现同一个歌手唱过的多个歌
        ArrayList list = new ArrayList();
        list.add("浴室");
        list.add("海浪");
        list.add("春天游泳");
        list.add("夜间独白");
        //把这整个当做deca joins的key
        map.put("Deca joins", list);
        System.out.println(map);

        //阶段3：自定义输出(for的方式)
        Set entrySet = map.entrySet();
        for (Object obj : entrySet) {
            if (obj instanceof Map.Entry) {
                Map.Entry e = (Map.Entry) obj;
                System.out.print("歌手：");
                System.out.println("\t" + e.getKey());
                System.out.print("ta的歌曲：");
                System.out.println("\t" + e.getValue());
            }
        }
    }
}
