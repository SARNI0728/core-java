package november.eleventh;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/11 17:30
 * @Version 1.0
 */
public class YangRope implements PersonFactory{

    @Override
    public Person createPerson() {
        return new Man();
    }
}
