package november.eleventh;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/11 16:47
 * @Version 1.0
 */
public class Woman implements Person{
    @Override
    public void eat() {
        System.out.println("女人吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("女人睡觉");
    }

    @Override
    public void talk(String message) {
        System.out.println("有个女人说：" + message);
    }
}
