package _extends;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/15 23:09
 * @Version 1.0
 */
public class Kids extends ManKind{
    int yearsOld;
    public void printAge(){
        System.out.println("今年" + yearsOld + "岁");
    }
    public void employeed(){
        super.employeed();
        System.out.println("but kids should study and no job");
    }
}
