package _this.exer3;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/16 10:56
 * @Version 1.0
 */
public class CheckAccount extends Account{
    private double overdraft;

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public void withdraw(double amt){
        if(amt <= getBalance()){
            setBalance(getBalance() - amt);
            System.out.println("取款" + amt + "元");
        }
        else if(amt <= overdraft + getBalance()){
            overdraft -= amt - getBalance();
            setBalance(0);
        }
        else {
            System.out.println("Our miner under attack.");
        }
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
}
