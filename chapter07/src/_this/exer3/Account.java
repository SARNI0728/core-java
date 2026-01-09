package _this.exer3;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/16 10:39
 * @Version 1.0
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account() {
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public double getMonthlyInterest(){
        return annualInterestRate / 12.0;
    }
    public void withdraw(double amt){
        if(amt <= balance){
            balance -= amt;
            System.out.println("取出" + amt + "元");
        }
        else
            System.out.println("Insufficient fund");
    }
    public void deposit(double amt){
        balance += amt;
    }

}
