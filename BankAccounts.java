public class BankAccounts {

    public BankAccounts(double startBalance) {
        this.balance = startBalance;
    }
    // variables are declared here
    private double balance;

    public void deposit(double amount) {
        // code goes here
        this.balance = this.balance + amount;
    }
    public void withdraw(double amount) {
        this.balance =  this.balance - amount;
    }
    public double getBalance() {
        return this.balance;
    }

}
