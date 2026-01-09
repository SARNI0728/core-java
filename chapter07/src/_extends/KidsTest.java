package _extends;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/15 23:32
 * @Version 1.0
 */
public class KidsTest {
    public static void main(String[] args) {
        Kids someKid = new Kids();
        someKid.sex = 1;
        someKid.salary = 0;
        someKid.yearsOld = 12;
        someKid.printAge();
        someKid.employeed();
        someKid.manOrWoman();
    }
}
