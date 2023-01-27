import java.util.Scanner;

//Check whether the number is prime or not

public class Practice_28 {
    public static void main(String[] args) {
        int n, count = 0, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether the number is prime or not");
        n = sc.nextInt();
//        Using while Loop
//        i = 1;//Initialization
//        while (i <= n)
//         {
//            if (n % i == 0)
//                count = count + 1;
//                i = i + 1;
//         }
//            if (count == 2) {
//                System.out.println("Prime Number");
//            } else {
//                System.out.println("Not a prime number");
//            }

//            Using for Loop
        for(i=1;i<=n;i++){
            if (n% i==0)
                count=count+1;
                i=i+1;

        }
        if (count == 2){
            System.out.println(n +" Is a Prime Number");
        }
        else{
            System.out.println(n +" Is not a Prime Number");

        }

    }
}