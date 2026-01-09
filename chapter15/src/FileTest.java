import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/12 14:12
 * @Version 1.0
 */
public class FileTest {
    @Test
    public void Test1(){
        File file1 = new File("abc.txt");
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file1.length());
        try {
            file1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File file2 = new File(file1.getAbsoluteFile().getParent() + "/hello.txt");
        System.out.println(file2.getAbsolutePath());
        if(!file2.exists()){
            try {
                String s = file2.createNewFile() ? "文件创建成功了" : "文件创建失败了";
                System.out.println(s);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public void Test3(){
        File dir = new File("C:\\Users\\刘亚宁\\OneDrive - sda\\图片");
//        for(String fileName : dir.list()){
//            if(fileName.toLowerCase().endsWith(".jpg")){
//                System.out.println(fileName);
//            }
//        }
        String[] fileNames = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".jpg");
            }
        });
        for(String str :fileNames){
            System.out.println(str);
        }

    }

}
