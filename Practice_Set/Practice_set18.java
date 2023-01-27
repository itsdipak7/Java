package Practice_Set;

import java.util.Scanner;

public class Practice_set18 {
    public static void main(String[] args) {
//  Take from user three numbers as input to calculate and print the average of the number
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        float avg=(num1+num2+num3)/3;
        System.out.println("Average of above number is "+avg);
    }
}
