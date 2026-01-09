package _this.exer3;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/16 10:50
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acc1 = new Account(721,20000,0.045);
        acc1.withdraw(30000);
        System.out.println(acc1.getBalance());
        acc1.withdraw(2500);
        acc1.deposit(3000);
        System.out.println("balance:" + acc1.getBalance() +
                "MonthlyRate:" + acc1.getMonthlyInterest()*100 + "%");
        CheckAccount acc2 = new CheckAccount(728,20000,0.045,5000);
        acc2.withdraw(5000);
        System.out.println("当前余额" + acc2.getBalance() +
                "\t当前可透支余额" + acc2.getOverdraft());
        acc2.withdraw(18000);
        System.out.println("当前余额" + acc2.getBalance() +
                "\t当前可透支余额" + acc2.getOverdraft());
        acc2.withdraw(3000);
        System.out.println("当前余额" + acc2.getBalance() +
                "\t当前可透支余额" + acc2.getOverdraft());
    }
}
