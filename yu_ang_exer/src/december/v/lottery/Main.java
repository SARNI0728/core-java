package december.v.lottery;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

//完成福利彩票系统：要求，用户从键盘录入彩票类型（3D或5D彩票）和注数。
// 将当前系统时间、彩票流水号（10位随机数）、及生成的彩票号码，写入文本文件中
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        StringBuilder flowNumber = new StringBuilder();
        StringBuilder awardNumber = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            flowNumber.append(r.nextInt(10));
        }
        System.out.println("输入彩票类型（3D或5D），在输入完成后将写入到文本文件中");
        int d = sc.nextInt();
        for (int i = 0; i < d; i++) {
            awardNumber.append(r.nextInt(10));
        }

        File f = new File("record.txt");

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(f,true))){
            bw.write(LocalDateTime.now() + "\t流水号：" + flowNumber + "\t彩票号码： " + awardNumber);
            bw.newLine();
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("执行完毕。 日志已保存在" + f.getAbsolutePath());


    }
}

