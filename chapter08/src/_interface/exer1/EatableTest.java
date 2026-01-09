package _interface.exer1;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/29 9:47
 * @Version 1.0
 */
public class EatableTest {
    public static void main(String[] args) {
        Eatable[] p = new Eatable[3];
        p[0] = new Chinese();
        p[1] = new Indian();
        p[2] = new American();
        p[0].eat();
        p[1].eat();
        p[2].eat();
    }
}
