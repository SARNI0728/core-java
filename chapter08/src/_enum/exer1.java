package _enum;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/18 18:23
 * @Version 1.0
 */
public class exer1 {
    private exer1(){
        //私有化构造器
    }
    private static exer1 single = new exer1();
    public static exer1 getInstance(){
        return single;
    }
}
