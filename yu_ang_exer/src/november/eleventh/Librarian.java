package november.eleventh;

import java.util.Arrays;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/11 15:43
 * @Version 1.0
 */
public class Librarian {
    static String[] books = {"《java基础》", "《mysql数据库》", "《java编程思想》"};
    String name;

    public Librarian(String name) {
        this.name = name;
    }

    public void printBooks(Student s){
        System.out.println("学生" + s.getName() + "可以借到的书有：");
        for (String str : checkAvailableBooks(s)){
            System.out.println(str + "\t");
        }
    }
    public String[] checkAvailableBooks(Student s) {
        if (s.getLibraryCard().getColor().equals("红色")
                && s.getLibraryCard().getLevel() == 'A') {
            return Arrays.copyOfRange(books, 0, 3);
        }
        if (s.getLibraryCard().getColor().equals("红色")
                && s.getLibraryCard().getLevel() == 'B') {
            return Arrays.copyOfRange(books, 0, 2);
        }
        return Arrays.copyOfRange(books, 0, 1);
    }
}
