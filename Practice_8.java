import java.util.Scanner;

public class Practice_8 {
    public static void main(String[] args) {
     int a=3, b=3,c;
     Scanner d= new Scanner(System.in);
switch (2){
    case 1:c=a+b;
        System.out.println("Addition of Two Number is :"+c);
        break;
    case 2:c=a-b;
        System.out.println("Substraction of Two Number is :"+c);
        break;
    case 3:c=a*b;
        System.out.println("Multiplication of Two Number is :"+c);
        break;
    case 4:c=a/b;
        System.out.println("Division of Two Number is :"+c);
        break;
    case 5:c=a%b;
        System.out.println("Reminder of Two Number is :"+c);
        break;
    default:
        System.out.println("Wrong Selection Sorry !!!");
}
    }
}
