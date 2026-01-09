package november.fifth;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/5 20:36
 * @Version 1.0
 */
public class GetAbsoluteValue {
    public static void main(String[] args) {
        System.out.println(GetAbsolute(-15));
    }
    public static int GetAbsolute(int num){
        if(num < 0)
            num *= -1;
        return num;
    }
}
