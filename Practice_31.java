import java.util.Scanner;

public class Practice_31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,z,count=0,digit,sum=0;
        System.out.println("Enter a Number ");
        n=sc.nextInt();
        z=n;
//        let n=153
        while (z>0){
            count=count+1;
            z=z/10;
        }
        z=n; //z=153
        while(z>0) {
            digit = z % 10;
            int pro = 1;
            for (int i = 1; i <= count; i++)
                pro = pro * digit;
            sum=sum+pro;
            z=z/10;
        }
        if (sum==n){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("No Armstrong Numberd");
        }
    }
}
