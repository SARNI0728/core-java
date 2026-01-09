package pigeonhole._1030;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/30 21:16
 * @Version 1.0
 */
public class Example {
    String str = new String("good");
    char[] ch = {'a', 'b', 'c'};

    public static void main(String args[]) {
        Example ex = new Example();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + "and");
        System.out.print(ex.ch);
    }

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'g';
    }
}