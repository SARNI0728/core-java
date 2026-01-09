import org.junit.Test;

import java.io.*;

public class BufferedStreamTest {
    @Test
    public void test01() throws IOException {
        File file1 = new File("/Users/sarni/Desktop/PKT/我的文库.rar");
        System.out.println(file1.getAbsolutePath());
        File file2 = new File(file1.getParent() + "/我的文库_copy.rar");
        System.out.println(file2.getAbsolutePath());

        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        byte[] cbuf = new byte[5];
        int len = 0;
        long start = System.currentTimeMillis();
        while((len = bis.read(cbuf)) != -1){
            bos.write(cbuf,0,len);
        }

        long end = System.currentTimeMillis();
        System.out.println("所用时间为:" + (end-start));
    }

}
