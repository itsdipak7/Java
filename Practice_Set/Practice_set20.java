package Practice_Set;

import java.util.Scanner;

public class Practice_set20 {
    public static void main(String[] args) {
//  Write a java program to add two binary numbers.
//  10+11=101
     Scanner sc=new Scanner(System.in);
     long binary1,binary2;
     int i=0,reminder=0;
     int[]sum=new int[20];
        System.out.println("Input first binary number:");
        binary1=sc.nextLong();
        System.out.println("Input second binary number:");
        binary2=sc.nextLong();

        while(binary1!=0 ||binary2!=0){
            sum[i++]=(int)((binary1%10+binary2 %10+reminder)/2);
            reminder=(int)((binary1%10+binary2 %10+reminder)/2);
            binary1=binary1/10;
            binary2=binary2/10;
        }
        if (reminder!=0){
            sum[i++]=reminder;
        }
        --i;
        System.out.println("Sum of two binary numbrs: ");
        while (i>=0){
            System.out.println(sum[i--]);
        }
        System.out.println();



    }
}
