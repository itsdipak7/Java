import java.util.Scanner;

public class Practice_42 {
    int a,b;
    Scanner sc=new Scanner(System.in);
    void getdata(){
        System.out.println("Enter the first number..");
        a=sc.nextInt();

        System.out.println("Enter the second number..");
        b=sc.nextInt();
    }

    void add(){
        int c= a+b;
        System.out.println("Adding of these number is "+c);
    }
}
class extending extends Practice_42{
    int mul;
void mul(){
    mul=a*b;
    System.out.println("Multiplying....");
    System.out.println("Just Wait.....");
}
void display(){
    System.out.println("Multiplication is "+ mul);
}
}
class here{
    public static void main(String[] args) {
        extending ex= new extending();
        ex.getdata();
        ex.add();
        ex.mul();
        ex.display();
    }
        }
