class variables {
    double balance;
    long AccountNum;
    String Address;
    String AccountName;
    static String BankName, BranchName, IFSC;

    void deposite(double amount)
    {
        balance=balance+amount;
        System.out.println(amount+" Deposited");
    }

    void withdraw(double amount)
    {
        if (balance==0)
            System.out.println("You don't hava enough money");
        else if (balance<amount)
            System.out.println("Insufficient Balance");
        else
            balance=balance-amount;
        System.out.println("Withdral = "+amount);
    }

    void currentbalance()
    {
        System.out.println("Current balance: "+balance);

    }

}


public class ATM {
    public static void main(String[] args) {
        variables v=new variables();
        variables s=new variables();
        variables.BankName="SBI";
        variables.BranchName="Purushottampur";
        variables.IFSC="UTIB00017";

        v.AccountNum=1203425828;
        v.AccountName="Krishna";
        v.balance=999999999;
        v.Address="Purushottampur Ganjam 740029";
        System.out.println("Account Details");
        System.out.println("Bank Name :"+v.AccountName);
        System.out.println("Branch Name :"+v.BranchName);
        System.out.println("IFSC :"+v.IFSC);
        System.out.println("Account Number :"+v.AccountNum);
        System.out.println("Balance :"+v.balance);
        v.withdraw(20000);
        v.currentbalance();

        System.out.println();

        s.AccountNum=1234235828;
        s.AccountName="Ram";
        s.balance=999999999;
        s.Address="Purushottampur Ganjam 740029";
        System.out.println("Account Details");
        System.out.println("Bank Name :"+s.AccountName);
        System.out.println("Branch Name :"+s.BranchName);
        System.out.println("IFSC :"+s.IFSC);
        System.out.println("Account Number :"+s.AccountNum);
        System.out.println("Balance :"+s.balance);
        s.withdraw(20000);
        s.currentbalance();

    }
}
