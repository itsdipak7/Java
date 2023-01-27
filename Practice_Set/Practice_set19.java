package Practice_Set;

import java.util.Scanner;

public class Practice_set19 {
    public static void main(String[] args) {
//  Print the area and perimeter of a rectangle
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
        float length=sc.nextFloat();
        System.out.println("Enter the breath");
        float breath=sc.nextFloat();
        float area=2*(length+breath);
        float peremeter=length*breath;
        System.out.println("Area of the Rectangle is "+area);
        System.out.println("Peremeter of the Rectangle is "+peremeter);
    }
}
