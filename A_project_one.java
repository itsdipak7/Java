import java.util.Scanner;

public class A_project_one {
   static String Bankname;
   static String Branchname;
   static String IFSC;
   long accNum;
   String accName;
   double balance;
   String Address;


void deposit(double amnt){
    balance=balance+amnt;
    System.out.println("Deposit Amount "+amnt);
}
void withdraw(double amnt){
    if(balance==0)
        System.out.println("You have no balance to withdrawa");
    else if(balance<amnt)
        System.out.println("Insufficient Balance");
    else{
        balance=balance-amnt;
        System.out.println("Withdraw :"+amnt);
    }
}
void currentbal(){
    System.out.println("Current Balance= "+balance);
}
}
class Ass{
    public static void main(String[] args) {
        A_project_one aa=new A_project_one();
        A_project_one bb=new A_project_one();
        A_project_one.Bankname="Axis";
        A_project_one.Branchname="Purushottampur";
        A_project_one.IFSC="IB000AXS";

        aa.accNum=323481232;
        aa.accName="Dipak Kumar Gouda";
        aa.balance=5000;
        aa.Address="Purushottampur";

        aa.accNum=332214423;
        aa.accName="Bikash ";
        aa.balance=30000;
        aa.Address="Bhabandha";

        System.out.println("Account Details");
        System.out.println("Bank Name "+aa.Bankname);
        System.out.println("Branch Name= "+aa.Branchname);
        System.out.println("IFSC "+aa.IFSC);
        System.out.println("Account Number "+aa.accNum);
        System.out.println("Balance "+aa.balance);
        aa.withdraw(2000);
        aa.currentbal();

        System.out.println();

        System.out.println("Account Details");
        System.out.println("Bank Name "+bb.Bankname);
        System.out.println("Branch Name= "+bb.Branchname);
        System.out.println("IFSC "+bb.IFSC);
        System.out.println("Account Number "+bb.accNum);
        System.out.println("Balance "+bb.balance);
        bb.deposit(12000);
        bb.currentbal();
    }
}
