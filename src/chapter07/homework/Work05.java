package chapter07.homework;
//1.创建新类，对每次存取款收取一元手续费
//2.创建新类，每个月有利息，且y有三次免手续费的存取款
//2.1属性：新增利率，交易次数
//2.2重写存取款方法：过滤交易次数(默认3，存取款一次则自减)
//2.3新增利息方法：重置交易次数(3)，利息自动存入(super.deposit)
public class Work05 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000);
        checkingAccount.deposit(10);
        System.out.println("您的余额为："+checkingAccount.getBalance());
        checkingAccount.withdraw(8);
        System.out.println("您的余额为："+checkingAccount.getBalance());
        SavingAccount savingAccount = new SavingAccount(100000);
        //定时器，月初自动调用该方法
        savingAccount.earnMonthlyInterest();
        System.out.println("您的余额为："+savingAccount.getBalance());
        savingAccount.deposit(2000);
        savingAccount.withdraw(1000);
        savingAccount.deposit(1000);
        System.out.println("三次存取后您的余额为："+savingAccount.getBalance());
        savingAccount.withdraw(999);
        System.out.println("第四次存取后您的余额为："+savingAccount.getBalance());
    }
}
class BankAccount{
    private double balance;

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }

}
class CheckingAccount extends BankAccount{
    public CheckingAccount(double balance) {
        super(balance);
    }
    @Override//重写父类方法
    public void deposit(double amount) {
        super.deposit(amount-1);
        //存款收取手续费==少存1元
    }
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount+1);
        //取款收取手续费==多取一元
    }
}
class SavingAccount extends BankAccount{
    private double rate = 0.01;
    private int tradeNum = 3;
    public SavingAccount(double balance) {
        super(balance);
    }
    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
    @Override
    public void deposit(double amount) {
        if(tradeNum > 0 ) {
            super.deposit(amount);
        }else{
            super.deposit(amount-1);
        }
        tradeNum --;
    }
    @Override
    public void withdraw(double amount) {
        if(tradeNum > 0 ) {
            super.withdraw(amount);
        }else{
            super.withdraw( amount+1);
        }
        tradeNum --;
    }
    public void earnMonthlyInterest(){
        tradeNum = 3;
        super.deposit(getBalance()*rate);
    }
}