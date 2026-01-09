import java.util.*;

import static java.util.Collections.shuffle;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/4 15:25
 * @Version 1.0
 */
public class PokerTest {
    public static void main(String[] args) {
        Poker[][] pokers = Poker.getPoker();
        ArrayList list = new ArrayList(54); //存放54个牌对象
        Iterator iterator = list.iterator();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                list.add(pokers[i][j]);
            }
        }
        list.add(pokers[4][0]);
        list.add(pokers[4][1]);
        System.out.println(list);// 全部冲入list后看看数组
        System.out.println("list中的牌数：" + list.size());

        shuffle(list); //开始发牌
        HashMap map = new HashMap();
        map.put("LYN", list.subList(0, 17));
        map.put("LSX", list.subList(17, 34));
        map.put("GXT", list.subList(34, 51));
        map.put("GZL", list.subList(51, 54));
        Set entrySet = map.entrySet();

        for (Object obj : entrySet) {
            if(obj instanceof Map.Entry){
                Map.Entry ele = (Map.Entry) obj;
                System.out.println(ele.getKey() + "手里的牌：");
                System.out.println(ele.getValue());
            }
        }
    }
}
