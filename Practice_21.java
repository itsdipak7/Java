import java.util.Scanner;
//Find a number is positive/negative/zero.
public class Practice_21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        if(number>1){
            System.out.println(number+" is a positive number");
        }
        else if(number<0){
            System.out.println(number+" is a negative number");
        }

        else{
            System.out.println(number+" is a zero number");
        }
    }
}
