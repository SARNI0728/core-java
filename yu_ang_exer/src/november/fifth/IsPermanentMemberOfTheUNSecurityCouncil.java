package november.fifth;

import java.util.Scanner;

/**
 * Description:
 *      给定一个国家名字，方法来判断这个国家名字是否为联合国 ···理事国
 * @Author SArNi
 * @Create 2025/11/5 20:52
 * @Version 1.0
 */
public class IsPermanentMemberOfTheUNSecurityCouncil {
    static String[] countries = {"中国","美国","俄罗斯","法国","英国"};
    public static void main(String[] args) {
        System.out.println("输入国家：");
        String userInputCountry = new Scanner(System.in).nextLine();
        for(String country : countries){
            if(country.equals(userInputCountry)){
            System.out.println("是");
            System.exit(0);
            }
        }
        System.out.println("不是");
    }
}
