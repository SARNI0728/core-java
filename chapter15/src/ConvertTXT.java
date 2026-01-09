import org.junit.Test;

import java.io.*;

public class ConvertTXT {
    //将模块中“康师傅的话”从gbk转换为utf8模式 保存在桌面上
    @Test
    public void Test1(){
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;

        try {
            File file1 = new File("康师傅的话.txt");
            System.out.println(file1.getAbsolutePath());
            File file2 = new File("/Users/sarni/Desktop/寄语.txt");

            FileInputStream fis = new FileInputStream(file1);
            FileOutputStream fos = new FileOutputStream(file2);

            isr = new InputStreamReader(fis, "gbk");
            osw = new OutputStreamWriter(fos, "utf8");

            char[] cbuf = new char[1024];
            int len;
            while ((len = isr.read(cbuf)) != -1) {
                osw.write(cbuf, 0, len); //读取cbuf中0到len（不包括len）的数据
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (isr != null) {
                    isr.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }try {
                if (osw != null) {
                    osw.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
