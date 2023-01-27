import java.util.Scanner;
//sum of n number
public class Practice_23 {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number ");
        n=sc.nextInt();
//        --> Using for Loop <--
//        for(int i=1;i<=n;i++){
//            sum=sum+i;
//        }
//            System.out.println("Sum of 1 to 5 is "+ sum);
//        --> Using while Loop <--
        int x=1;
        while( x<=n){
            sum=sum+x;
            x++;
        }
        System.out.println("Sum of n number is "+ sum);
    }
}
