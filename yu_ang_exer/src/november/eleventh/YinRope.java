package november.eleventh;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/11 18:38
 * @Version 1.0
 */
public class YinRope implements PersonFactory{
    @Override
    public Person createPerson() {
        return new Woman();
    }
}
