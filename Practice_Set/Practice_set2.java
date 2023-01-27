package Practice_Set;

import java.util.Scanner;

class convert{
    Scanner sc=new Scanner(System.in);
    public void Convert(){
        System.out.println("Enter Kilometer to conver in to miles");
        float Kilometer=sc.nextInt();
        float miles=0.621f;
       float km=Kilometer*miles;
        System.out.println(km);
    }

        }
public class Practice_set2 {
    public static void main(String[] args) {
//        Write a java program to converts Kilometer to Miles
        convert c=new convert();
        c.Convert();

    }
}
