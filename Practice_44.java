import java.util.Scanner;

public class Practice_44 {
    Scanner sc=new Scanner(System.in);
   int s,b;
    void input(){
        System.out.println("Enter first value");
     s=sc.nextInt();
        System.out.println("Enter second value");
     b=sc.nextInt();
    }
}

class  st extends Practice_44{
    int c;
    void sum(){
        c=s+b;
        System.out.println("Sum of these number is "+c);
    }
}

class  ss extends Practice_44{
    int c;
    void sub(){
        c=s-b;
        System.out.println("Substraction of these number is "+c);
    }
}

class mainss{
    public static void main(String[] args) {
        st s=new st();
        ss sp=new ss();
        s.sum();
        sp.sub();
    }
}