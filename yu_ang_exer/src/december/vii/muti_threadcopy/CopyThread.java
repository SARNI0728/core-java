package december.vii.muti_threadcopy;

import java.io.*;

public class CopyThread implements Runnable {
    File srcFile;
    File destFile;

    public CopyThread(String src, String dest) {
        srcFile =  new File(src);
        destFile = new File(dest,"副本 - " + srcFile.getName());
    }

    @Override
    public void run() {
        if(!srcFile.exists())
            System.out.println("指定的文件不存在。程序退出。");

        try(
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(srcFile));
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(destFile))
        ){
            byte[] buffer = new byte[1024];
            int len;
            while ((len = in.read(buffer)) != -1) {
                out.write(buffer, 0, len);
                System.out.print("\r" + srcFile.getName() +"文件进度：" + String.format("%.2f%%", (destFile.length() * 100.0) / srcFile.length()));
            }
            System.out.println("\n" + srcFile.getName() + "复制完毕。");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
