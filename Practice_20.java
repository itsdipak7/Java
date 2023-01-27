import java.util.Scanner;

//Check the number is even or odd
public class Practice_20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number ");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("It is an even number ");
        }
        else{
            System.out.println("It is an odd number");
        }
    }
}
