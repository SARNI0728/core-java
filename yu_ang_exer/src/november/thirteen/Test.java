package november.thirteen;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File file = new File("abc.txt");
        System.out.println(file.getAbsolutePath());
    }
}
