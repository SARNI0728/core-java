package november.eleventh;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/11 16:52
 * @Version 1.0
 */
public class TestClayToWomanFactor {
    public static void main(String[] args) {
        ClayToHumanFactor factor = new ClayToHumanFactor();
        Person man = new ClayToHumanFactor().createPerson("男");
        Person woman = new ClayToHumanFactor().createPerson("女");
        man.eat();
        man.talk("今天天气好极了");
        woman.sleep();
    }
}
