import java.util.Scanner;

public class Practice_4 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner ds=new Scanner(System.in);
        System.out.println("Enter the value of a ");
        a=ds.nextInt();
        System.out.println("Enter the value of b ");
        b=ds.nextInt();

        c=a;
        a=b;
        b=c;
         System.out.println("Value in a :"+a);
        System.out.println("Value in b :"+b);
    }
}
