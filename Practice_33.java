import java.util.Scanner;

public class Practice_33 {
    public static void main(String[] args) {
//        Find X Raised to the Power Y
            int pro=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a base");
       int n=sc.nextInt();
        System.out.println("Power of a base");
        int p=sc.nextInt();
        while (p>0){
            pro=pro*n;
            p--;
        }
        System.out.println("Value = "+pro);

    }
}
