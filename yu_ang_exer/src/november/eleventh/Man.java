package november.eleventh;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/11 16:46
 * @Version 1.0
 */
public class Man implements  Person{
    @Override
    public void eat() {
        System.out.println("男人吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("男人睡觉");
    }

    @Override
    public void talk(String message) {
        System.out.println("有个男人说：" + message);
    }
}
