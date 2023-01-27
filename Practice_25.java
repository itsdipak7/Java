import java.util.Scanner;

public class Practice_25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,dig,pro=1,sum=0;
        System.out.println("Enter a number");
        n=sc.nextInt();
        while(n>0)
        {
            dig=n%10;
            if(dig%2==0){
                sum=sum+dig;
            }
            else{
                pro=pro*dig;
            }

        }
                System.out.println("sum "+sum+" pro "+pro);

    }
}
