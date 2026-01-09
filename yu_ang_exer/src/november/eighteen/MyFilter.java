package november.eighteen;

import java.util.Scanner;

public class MyFilter {
    /*实现聊天过滤器，完成功能如下：用户从键盘录入聊天内容，系统会对聊天内容进行过滤，
    如果出现了限定文字，对其进行替换成*号处理(几个字替换成几个*号)。*/
    static String[] dirtyWord = {"煞笔","低能儿","王八操的"};

    public static void main(String[] args) {
        System.out.println("输入想说的话...");
        Scanner sc = new Scanner(System.in);
        StringBuilder msg = new StringBuilder(sc.nextLine());

        for(String word : dirtyWord){
            if(msg.toString().contains(word)){
                int startIndex = msg.toString().indexOf(word);
                for (int i = startIndex;i < startIndex + word.length(); i++) {
                    msg.replace(i, i+1, "*");
                }
            }
        }
        System.out.println("系统输出：" + "\n" +  msg);
    }
}