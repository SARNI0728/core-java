package _static.exer1;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/28 10:32
 * @Version 1.0
 */
public class Bank {
    private long acc; //账号
    String password;//密码
    double balance;//账户余额
    static double rate;//利率
    static double mbalance;//最小余额
    static long init = 894752468L;
    Bank(){
        acc = init++;
        rate = 0.05;
        mbalance = 20;
    }
    Bank(double balance){
        this();
        this.balance = balance;
    }

    public String toString(){
        return ("Bank[" +
                "acc = " + acc + "balance = " + balance +
                "rate = "+ rate + "]");
    }

}
