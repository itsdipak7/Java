import java.util.Scanner;

public class Practice_34_Star_Pattern {
    public static void main(String[] args) {
//        Star Printing Shape Printing Pyramid Printing Part-1
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows");
        n=sc.nextInt();
//        *
//        **
//        ***
//        ****
//        *****
//        for (i=1;i<=n;i++)
//        {
//            for (int j=1;j<=i;j++)
//                System.out.print("*");
//            System.out.println();
//        }

//    1
//    12
//    123
//    1234
//    12345
//        for (i=1;i<=n;i++)
//        {
//            for (int j=1;j<=i;j++)
//            System.out.print(j);
//            System.out.println();
//        }
//    1
//    22
//    333
//    4444
//    55555
//        for (i=1;i<=n;i++){
//            for (int j=1;j<=i;j++)
//                System.out.print(i);
//            System.out.println();
//        }

//    2
//    23
//    456
//    5678
//    678910

//        for (i=1;i<=n;i++){
//            for (int j=1;j<=i;j++)
//                System.out.print(i+j);
//            System.out.println();
//        }

        for (i=1;i<=n;i++){
            for (int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
