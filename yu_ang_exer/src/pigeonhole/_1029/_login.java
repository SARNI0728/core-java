package pigeonhole._1029;

import java.util.Scanner;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/29 12:16
 * @Version 1.0
 */
public class _login {
    public static void main(String[] args) {
        String realPassword = "A123456";
        Scanner userPassword = new Scanner(System.in);
        int wrongTimes = 0; //表示错误的次数
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter password:");
            if(userPassword.nextLine().equals(realPassword)){
                System.out.println("Welcome");
                break;
            }
            if(++wrongTimes >= 3){
                System.out.println("Account has been locked.");
                break;
            }
            System.out.println("Wrong password,Try again.");
        }
    }
}
