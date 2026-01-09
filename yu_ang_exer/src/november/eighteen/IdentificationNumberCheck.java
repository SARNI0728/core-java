package november.eighteen;

import java.util.Scanner;
import java.util.function.Predicate;

public class IdentificationNumberCheck {
//    从键盘接收用户身份证号码，必须是18位长，前17位必须是数字，最后1位必须是数字或大写X（使用普通方法和正则表达式，分别验证），
//    如果身份证号码正确，则只显示前6位和后4位，中间8位生日部分以*号替换。
//    根据倒数第2位，判断性别，单数显示“先生”，双数显示“女士”。
    public static void main(String[] args) {
        System.out.println("输入身份证");
        Predicate<String> check = userInput -> regexCheckNumber(userInput);
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if(check.test(userInput))
            outNumber(userInput);
        else
            System.out.println("不符合规则");

        System.out.println("普通方法测试，输入身份证：");

        Predicate<String> check2 = IdentificationNumberCheck::normalCheckNumber;
        userInput = scanner.nextLine();
        if(check2.test(userInput))
            outNumber(userInput);
        else
            System.out.println("不符合规则");
    }

    public static void outNumber(String userInput){
        String star = "********";
        StringBuilder sb = new StringBuilder(userInput);
        sb.replace(6,6+star.length(),star);
        if(userInput.charAt(16) == '1')
            sb.insert(0,"先生,你的身份证号为：");
        else
            sb.insert(0,"女士,你的身份证号为：");
        System.out.println(sb);
    }

    public static boolean regexCheckNumber(String number) {
        if(number.length() != 18)
            return false;
        return number.substring(0,17).matches("[0-9]+") && number.substring(17).matches("([0-9]|X)+");
    }
    public static boolean normalCheckNumber(String number) {
        if(number.length() != 18)
            return false;
        for(char c : number.substring(0,17).toCharArray()){
            if(!Character.isDigit(c))
                return false;
        }
        if(!Character.isDigit(number.charAt(17)) && number.charAt(17) != 'X'){
            return false;
        }
            return true;
    }
}
