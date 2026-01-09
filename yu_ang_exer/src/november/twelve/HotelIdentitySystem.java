package november.twelve;

import java.util.Scanner;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/12 20:03
 * @Version 1.0
 */
public class HotelIdentitySystem {
    static String[] suspectIDs = {"123","124"};

    public static void main(String[] args) {
        System.out.println("酒店认证系统，输入你的身份证");
        try {
            checkIdNum(new Scanner(System.in).nextLine());
        } catch (PersonException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void checkIdNum(String idNum) throws PersonException{
        for(String suspectID : suspectIDs){
            if(suspectID.equals(idNum)){
                throw new PersonException("当前人员为在逃嫌犯");
            }
        }
    }
}
