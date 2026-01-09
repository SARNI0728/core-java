package december.v.copyfile;

import java.io.*;

public class CopyFiles {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("/Users/sarni/JAVA学习/文件夹1");
        File descFile = new File("/Users/sarni/JAVA学习/新文件夹");
        copyFile(srcFile,descFile);
    }

    public static void copyFile(File src,File dest) throws IOException {
        if(!src.exists()){
            return;
        }

        if(src.isDirectory()){
            for(File f : src.listFiles()) {

                if(f.isDirectory()) {
                    File newDir = new File(dest, f.getName());
                    newDir.mkdir();
                    copyFile(f,newDir);
                }

                if(f.isFile()) {
                    FileInputStream fis = new FileInputStream(f);
                    BufferedInputStream bis = new BufferedInputStream(fis);

                    File newFile = new File(dest, f.getName());
                    FileOutputStream fos = new FileOutputStream(newFile);
                    BufferedOutputStream bos = new BufferedOutputStream(fos);

                    byte[] cbuf = new byte[1024];
                    int len;

                    while((len = bis.read(cbuf)) != -1){
                        bos.write(cbuf,0,len);
                    }

                    bis.close();
                    bos.close();
                }
            }
        }
    }
}
