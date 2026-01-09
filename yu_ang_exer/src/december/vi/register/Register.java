package december.vi.register;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

//完成用户注册功能：要求从键盘接收用户名和密码，将数据写入到users文件夹中，要求文件以用户名命名。如果文件夹中已存在该名字，则提示用户注册失败，
// 否则，使用对象序列化方式，将用户信息存储到文件中。
//完成用户登录功能：要求从键盘接收用户名，如果用户在users文件夹中找不到，则提示用户不存在。否则比对用户密码，如果密码正确，提示登录成功，否则提示登录失败。
public class Register {
    public static void main(String[] args) {
        File userDir = new File("/Users/sarni/JAVA学习/javacode/javacode/JavaSECode/yu_ang_exer/src/december/vi/register/users");
        if(!userDir.exists()){
            if(userDir.mkdir())
                System.out.println("文件夹创建成功");
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("输入要创建的用户名");
        String id = sc.nextLine();
        System.out.println("输入密码");
        String password = sc.nextLine();

        User u =  new User(id,password);

        //为此实例创建对应文件夹
        File dir  = new File(userDir,id);
        if(!dir.exists()){
            //为此实例创建对应文件
            if(dir.mkdir()){
                System.out.println("文件夹" + id + "创建成功");
                File userFile = new File(dir,id + ".dat");

                try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(userFile))){
                    oos.writeObject(u);
                    System.out.println("对象写出完成。 保存在了：" + userFile.getAbsolutePath());
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        }else
            System.out.println("文件夹已存在。不予创建。");
    }
}
