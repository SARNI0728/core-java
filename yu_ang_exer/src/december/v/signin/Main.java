package december.v.signin;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

//完成签到系统：
//用户名单生成：从键盘录入所有人员姓名，直到录入“完成”字样结束，将名单写入“签到表.txt”文件中
//用户签到表生成：从键盘录入签到人员姓名，直到录入“完成”字样结束，将名单写入“xxxx年xx月xx日_签到表.txt”文件中
//用户缺席表生成：通过程序比对上面两个文件，将没有签到的人员获取，写入“xxxx年xx月xx日_缺席表.txt”文件中
public class Main {
    public static void main(String[] args) {
        File f = new File("签到表.txt");
        Scanner sc = new Scanner(System.in);

        System.out.println("输入所有的人员姓名,输入‘完成’结束。");

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(f))){
            String tempStr = sc.nextLine();
            while(!tempStr.equals("完成")){
                bw.write(tempStr);
                bw.newLine();
                System.out.println("录入成功。 现在可以输入下一个了。");
                tempStr = sc.nextLine();
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        //读取整个签到表，结果存入到一个list
        ArrayList<String> strings = new ArrayList<>();
        try(BufferedReader bf = new BufferedReader(new FileReader(f))){
            String line;
            while((line = bf.readLine()) != null){
                strings.add(line);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        //文件名
        LocalDate today = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String todayStr = dtf.format(today);

        //找到签到的人员，将所有签到的人员保存到新的list
        ArrayList<String> signedList = new ArrayList<>();


        System.out.println("输入签到人员姓名，输入‘完成’结束。");
        String tempStr = sc.nextLine();
        while(!tempStr.equals("完成")){
            if(strings.contains(tempStr)){
                System.out.println(tempStr + "已签到");
                signedList.add(tempStr);
                strings.remove(tempStr);
                tempStr = sc.nextLine();
            }else
                System.out.println("签到失败。 因为员工表无此人：" + tempStr);
        }

        File signedTable = new File(todayStr+"_签到表 .txt");

        //将signedlist的内容全部写入到signedtable
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(signedTable))){
            for(String temp : signedList){
                bw.write(temp);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

        //将剩下的人员全部写入到unsignedtable
        File unsignedTable = new File(todayStr + "_缺勤表 .txt");
        //将signedlist的内容全部写入到signedtable
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(unsignedTable))){
            for(String temp : strings){
                bw.write(temp);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
