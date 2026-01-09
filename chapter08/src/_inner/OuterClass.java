package _inner;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/18 16:11
 * @Version 1.0
 */
public class OuterClass {
    public static void main(String[] args) {
        new Object(){
            public void test(){
                System.out.println("匿名内部类");
            }
        }.test();
    }
}
