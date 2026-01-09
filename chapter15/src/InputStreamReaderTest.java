import org.junit.Test;

import java.io.*;

public class InputStreamReaderTest {

    @Test
    public void test1() throws IOException {

        File file1 = new File("dbcp_gbk.txt");
        File file2 = new File("dbcp_gbkTest.txt");

        FileInputStream fis = new FileInputStream(file1);
        InputStreamReader isr = new InputStreamReader(fis,"gbk");

        FileOutputStream fos = new FileOutputStream(file2);
        OutputStreamWriter osw = new OutputStreamWriter(fos,"utf8");

        char[] cbuf = new char[1024];
        int len;
        while ((len=isr.read(cbuf))!=-1){
            osw.write(cbuf,0,len);
        }

        osw.close();
        fos.close();
    }
}
