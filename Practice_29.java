import java.util.Scanner;
//Factorial Value Find
public class Practice_29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,fact=1;
        System.out.println("Enter a number to find factorial value");
        n=sc.nextInt();
        while (n>0){
            fact=fact*n;
            n=n-1;
        }
        System.out.println("Factorial = "+ fact);
    }
}
