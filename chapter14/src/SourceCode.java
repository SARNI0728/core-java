import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/6 20:02
 * @Version 1.0
 */
public class SourceCode {
    @Test
    public void Test1(){ //本方法用于查看ArrayList的源代码
        ArrayList<String> strings = new ArrayList<>();

        strings.add("AA");
        strings.add("BB");
    }

    @Test
    public void Test2(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("AA",721);
    }
}
