package december.xii.dispatchtask;
/*使用线程池完成三个调度任务：
任务1：2分钟后复制一个文本文件到d盘下
任务2：30秒后显示当前系统时间
任务3：1分种后读取新复制的文件打印到屏幕上，如果文件不存在，每隔30秒检测一次，直到读取到文件内容，打印完后，退出虚拟机*/


import java.io.*;
import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.System.exit;
import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        File file = new File("record.txt");
        File newfile = new File("newFile.txt");

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(() -> {
            System.out.println("读取文件状态线程已启动,将每隔30秒读取一次文件内容···");

            while(true){
                sleep(30 * 1000);
                if(!newfile.exists()){
                    System.out.println("当前文件还不存在");
                }else{
                    System.out.println("已检测到文件，新文件的内容为：");
                    try(BufferedReader br = new BufferedReader(new FileReader(newfile))){
                        String line;
                        while((line = br.readLine()) != null){
                            System.out.println(line);
                        }
                    }
                }
            }
        });

        executorService.submit(() -> { //每隔30秒显示一次当前时间
            System.out.println("时间打印线程已启动，将每隔30秒显示一次时间···");
            while(true) {
                sleep(30 * 1000);

                LocalDateTime now = LocalDateTime.now();
                System.out.println(now);
            }
        });

        executorService.submit(() -> { //文件复制线程

            if (!file.exists()) {
                System.out.println("文件不存在，程序退出。");
                exit(0);
            }
            System.out.println("已检测到文件，准备在两分钟后开始复制文件···");

            try {
                sleep(120 * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try(
                    BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
                    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newfile));
                    ){
                byte[] buffer = new byte[1024];
                int len;
                while ((len = bis.read(buffer)) != -1) {
                    bos.write(buffer, 0, len);
                }
                System.out.println("文件复制完毕。");
            }catch(Exception e){
                e.printStackTrace();
            }
        });
    }
}
