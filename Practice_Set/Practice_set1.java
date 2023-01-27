package Practice_Set;

import java.util.Scanner;

class greets{
    Scanner sc=new Scanner(System.in);
    public void Greet(){
    System.out.println("Enter your name");
    String name=sc.next();

        System.out.println("Hello "+name+" have a good day");
    }

}
public class Practice_set1 {
    public static void main(String[] args) {
//        Write a java program that asks the user to enter his/her name
//        and greets them "Hello<name>, have a good day" text.
        greets g=new greets();
        g.Greet();
    }
}
