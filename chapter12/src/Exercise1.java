import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/3 15:36
 * @Version 1.0
 */
public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("请录入学生信息");
        Scanner s = new Scanner(System.in);
        List l = new ArrayList<>();

        while(true){
            System.out.println("按任意键继续录入，按0退出");
            if(s.nextInt() == 0)
                break;
            s.nextLine();
            System.out.println("输入姓名按下回车，再次输入年龄按下回车");
            l.add(new Student(s.nextLine(),s.nextInt()));

        }
        System.out.println("遍历学生信息：");
        for(Object obj : l){
            System.out.println(obj);
        }
    }
}
