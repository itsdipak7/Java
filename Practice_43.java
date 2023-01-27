import java.util.Scanner;

public class Practice_43 {
    int a;
    Scanner sc=new Scanner(System.in);
    void input(){
        System.out.println("Enter the first element..........");
        a=sc.nextInt();

    }
}
class a_one extends Practice_43{
    int b;
    void getdata(){
        System.out.println("Enter the second element.....");
        b=sc.nextInt();

    }

}
class ress extends a_one{
    int c;
    void result(){
        c=a+b;
        System.out.println("The sum of these element is "+c);
    }
}
class ca{
    public static void main(String[] args) {
        ress r=new ress();
        r.input();
        r.getdata();
        r.result();
    }
}