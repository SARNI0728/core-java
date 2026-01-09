package _extends;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/15 23:07
 * @Version 1.0
 */
public class ManKind {
    int sex;
    int salary;
    public void manOrWoman(){
        if(sex == 1)
            System.out.println("男的");
        else
            System.out.println("女的");
    }
    public void employeed(){
        if(salary == 0){
            System.out.println("no job");
        }
        else
            System.out.println("job");
    }
}
