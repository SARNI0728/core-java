package pigeonhole._1029;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/29 12:41
 * @Version 1.0
 */
public class replaceAll {
    private static void _replaceAll(String s , String content){
        s = content;
    }
    public static void main(String[] args) {
        String s = "123abc";
        _replaceAll(s,"abc123");
        System.out.println(s);

    }
}
