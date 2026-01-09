import org.junit.Test;

import java.io.File;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/12 15:02
 * @Version 1.0
 */
public class Exer03 {
    long sumCap = 0;
    @Test
    public void Test(){
        File dir = new File("D:\\DL");
        getFolderSize(dir);
    }
    public void printFileName(File file){
        for(File f : file.listFiles()){
            if(f.isDirectory()){
                printFileName(f);
            }else if(f.isFile()){
                System.out.println(f.getName());
            }
        }
    }

    public long getDirectorySize(File file){
        //计算提供的文件夹的大小
        for(File f : file.listFiles()){
            if(f.isDirectory()){
                getDirectorySize(f);
            }else if(f.isFile()){
                sumCap += f.length();
            }
        }
        return sumCap;
    }

    public void getFolderSize(File file){
        long sumCap = 0;
        sumCap = getDirectorySize(file);
        System.out.println("这个文件/夹总共占用" + sumCap + 'B');
    }
}
