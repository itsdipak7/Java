//Nested loop pattern

import java.util.Scanner;

public class Practice_38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter rows");
        int a= sc.nextInt();//For Rows
        System.out.println("Enter columns");
        int b=sc.nextInt();//For column

        for (int i=0;i<a;i++)
        {
            for (int j=0;j<i;j++)
            {
              System.out.print("*");
            }
        System.out.println();
        }
    }
}
