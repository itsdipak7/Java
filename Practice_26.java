import java.util.Scanner;

public class Practice_26 {
    public static void main(String[] args) {
//Write a java program to check whether a number is palindrome or not
        Scanner sc=new Scanner(System.in);
        int n,rev=0,z;
        System.out.println("Enter any number ");
        n=sc.nextInt();
        z=n;
        while(n>0){
            rev=(rev*10)+n%10;
            n=n/10;
        }
        System.out.println(rev);

            if(rev==z){
                System.out.println("The number is a palindrome");
            }
            else{
                System.out.println("The number is not palindromeb  ");
            }
    }
}
