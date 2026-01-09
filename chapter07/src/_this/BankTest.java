package _this;

import java.util.Scanner;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/14 11:00
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        Bank b = new Bank();
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("---SArNi管理系统v1.0---");
            System.out.println("1 添加用户");
            System.out.println("2 修改用户");
            System.out.println("3 客户列表");
            System.out.println("4 退   出");
            System.out.println("请输入操作编号：");
            switch (s.nextInt()){
                case 1:
                    b.cust_add();
                    break;
                case 2:
                    b.cust_modfi();
                    break;
                case 3:
                    b.info_list();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("没有此编号");
            }
        }
    }
}
