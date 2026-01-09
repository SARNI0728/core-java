package _this;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/14 10:29
 * @Version 1.0
 */
public class Account {
    private double balance;
    public Account(double balance){
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amt){
        balance += amt;
    }
    public void withdraw(double amt){
        if(amt <= balance){
            balance -= amt;
            System.out.println("成功取出" + amt + "元");
        }else {
            System.out.println("余额不足");
        }
    }
}
