import java.util.Scanner;
public class Practice_35 {
    int n;

    void getdata()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number to check whether the number is prime or not");
    n=sc.nextInt();
    }

    void putdata(){
    int count=0,i;
        for(i=1;i<=n;i++){
            if(n%i==0) {
                count = count + 1;
            }
        }
        if(count==2)
        {
        System.out.println("The number is prime");
        }
        else
        {
        System.out.println("The number is not a prime");
        }
    }
    public static void main(String[] args) {
        Practice_35 pp=new Practice_35();
        pp.getdata();
        pp.putdata();
    }
}
