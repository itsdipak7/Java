import java.util.Scanner;

public class Practice_32 {
    public static void main(String[] args) {
//        Find the Fibonacci Series
        Scanner sc=new Scanner(System.in);
        int n,x=0,y=1,sum=0;
        System.out.println("Enter Max Calue");
        n=sc.nextInt();
        while(sum<=n){
            System.out.println(sum);
            x=y;
            y=sum;
            sum=x+y;
        }
    }
}
