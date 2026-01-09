package _this;

import java.util.Scanner;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/14 10:49
 * @Version 1.0
 */
public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;
    Scanner s = new Scanner(System.in);
    public Bank(){
        customers = new Customer[10];
    }
    public int addCustomer(){
        customers[numberOfCustomer++] = new Customer();
        return numberOfCustomer-1;
    }
    public int getNumberOfCustomer(){
        return numberOfCustomer;
    }
    public Customer getCustomer(int index){
        return customers[index];
    }
    public void info_list(){
        System.out.println("id\t\t姓名\t\t年龄\t\t电话\t\t\t\t邮箱");
        for (int i = 0; i < numberOfCustomer; i++) {
            System.out.println(customers[i].getId() +"\t\t" +
                    customers[i].getFirstName()+"\t\t" +
                    customers[i].getLastName()+"\t\t"+
                    customers[i].getAge()+"\t\t"+
                    customers[i].getTel()+"\t\t"+
                    customers[i].getEmail());
        }
    }
    public void cust_add(){
        System.out.println("欢迎注册，请依照指示填写信息,输入-1回到主界面，输入其他任意数字继续。");
        if(s.nextInt() == -1)
            return;
        int i = addCustomer();
        System.out.println("姓：");
        customers[i].setLastName(s.next());
        System.out.println("名：");
        customers[i].setFirstName(s.next());
        System.out.println("年龄：");
        customers[i].setAge(s.nextInt());
        System.out.println("电话：");
        customers[i].setTel(s.next());
        System.out.println("邮箱：");
        customers[i].setEmail(s.next());
        //分配id，id是从10000到99999的随机数。
        int id = (int)(Math.random()*(100000 - 10000) + 10000);
        customers[i].setId(id);
        System.out.println("注册成功！ 您的Id是:"  + id);
    }
    public int cust_index(int id){
        //输入id，返回数组下标
        for (int i = 0; i < 10; i++) {
            if(id == customers[i].getId())
                return i;
        }
        return -1;
    }
    public void cust_modfi(){
        //修改客户信息，回车表示不修改任何内容
        System.out.println("请输入要修改的Id，输入-1退出。");
        Scanner s = new Scanner(System.in);
        int index = cust_index(s.nextInt());
        s.nextLine(); //吸收空格
        System.out.print("firstname:(" + customers[index].getFirstName() +"):" );
        String str = s.nextLine();
        if(!str.isEmpty()){
            customers[index].setFirstName(str);
        }else {
            System.out.println("您选择了保持不变.");
        }
        System.out.print("lastname:(" + customers[index].getLastName() +"):" );
        str = s.nextLine();
        if(!str.isEmpty()){
            customers[index].setLastName(str);
        }else {
            System.out.println("您选择了保持不变.");
        }
        System.out.print("age:(" + customers[index].getAge() +"):" );
        str = s.nextLine();
        if(!str.isEmpty()){
            customers[index].setAge(Integer.parseInt(str));
        }else {
            System.out.println("您选择了保持不变.");
        }
        System.out.println("修改完成了");
    }
}
