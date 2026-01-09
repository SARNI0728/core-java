package november.twenty_three.getPhoneNumber;

import java.util.ArrayList;
import java.util.Random;

/*随机生成1000个电话号码，存入集合中，要求电话号码必须是1开头，第2位必须是[3\5\7\8\9]中的一位，后面是9位数字
        从1000个电话号码中随机抽取4个做为中奖号码
中奖号码只显示前3位和后4位，中间4位用*号代替*/

public class Main {
    public static void main(String[] args) {
        ArrayList<String> phoneNumbers = new ArrayList<>(1000);
        StringBuilder numbers = new StringBuilder("12345678910");
        for (int i = 0; i < 1000; i++) {
            numbers.setCharAt(1,randomGetChar());
            numbers.replace(2,11,String.valueOf((long)(Math.random() * 10000000 + 100000000)));
            System.out.println(numbers);
            phoneNumbers.add(numbers.toString());
        }
        Random random = new Random();
        System.out.println("开始抽奖，中奖号码是：");
        for (int i = 0; i < 4; i++) {
            System.out.println(new StringBuilder(phoneNumbers.get(random.nextInt(1000))).replace(3,7,"****"));
        }
    }
    public static char randomGetChar(){
        //随机获取一个数字，3 5 7 8 9中的一位
        switch ((int)(Math.random() * 5)){
            case 0 -> {return '3';}
            case 1 -> {return '5';}
            case 2 -> {return '7';}
            case 3 -> {return '8';}
            case 4 -> {return '9';}
        }
        return '0';
    }
}
