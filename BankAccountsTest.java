
public class BankAccountsTest 
{
    public static void main(String[] args)
    {
       BankAccounts myAccounts = new BankAccounts(100);

        myAccounts.deposit(20);
        myAccounts.withdraw(50);
        System.out.println(myAccounts.getBalance());
    }
}


