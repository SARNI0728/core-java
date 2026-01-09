package december.vi.register;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入要登陆的用户名：");
        String id = sc.nextLine();
        File userDir = new File("/Users/sarni/JAVA学习/javacode/javacode/JavaSECode/yu_ang_exer/src/december/vi/register/users/" + id);
        if(!userDir.exists()){
            System.out.println("查无此人");
        }else {
            System.out.println("输入密码");
            String password = sc.nextLine();

            File userFile = new File(userDir,id + ".dat");
            try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(userFile))){
                User user = (User)ois.readObject();
                if(user.getPassword().equals(password)){
                    System.out.println("欢迎！" + user.getId() + "。");
                }else{
                    System.out.println("密码不正确。");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
