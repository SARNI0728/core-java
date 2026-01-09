package december.vi.record;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Properties;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try(FileInputStream fis = new FileInputStream(new File("/Users/sarni/JAVA学习/javacode/javacode/JavaSECode/yu_ang_exer/src/december/vi/record/info.properties"))) {
            properties.load(fis);
            System.out.println(properties);
            Student s = new Student(properties.getProperty("student.name"),properties.getProperty("student.gender"),Integer.parseInt(properties.getProperty("student.age")));
            Teacher t = new Teacher(properties.getProperty("teacher.name"),properties.getProperty("teacher.gender"),Integer.parseInt(properties.getProperty("teacher.age")));

            File log = new File("/Users/sarni/JAVA学习/javacode/javacode/JavaSECode/yu_ang_exer/src/december/vi/record/log.txt");
            System.out.println("输入操作人：");
            Scanner sc = new Scanner(System.in);
            String operate = "操作人： "+ sc.nextLine() + "操作时间：";

            //开始将对象写到文件中
            File student = new File("/Users/sarni/JAVA学习/javacode/javacode/JavaSECode/yu_ang_exer/src/december/vi/record/" + "student.dat");
            File teacher = new File("/Users/sarni/JAVA学习/javacode/javacode/JavaSECode/yu_ang_exer/src/december/vi/record/" + "teacher.dat");
            try(
                    ObjectOutputStream oos_s = new ObjectOutputStream(new FileOutputStream(student));
                    ObjectOutputStream oos_t = new ObjectOutputStream(new FileOutputStream(teacher));
                    BufferedWriter fw = new BufferedWriter(new FileWriter(log));
            ) {
                oos_s.writeObject(s);
                fw.write(operate + LocalDateTime.now() + "操作文件大小：" + student.length());
                fw.newLine();
                oos_t.writeObject(t);
                fw.write(operate + LocalDateTime.now() + "操作文件大小：" + teacher.length());
                fw.newLine();
                System.out.println("操作完成");
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
