package Practice_Set;
import java.util.Scanner;

public class Practice_set14 {
    public static void main(String[] args) {
        //Table print
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of table");
        int table=sc.nextInt();
        int mul=1;
        for (int i=1;i<=10;i++){
            System.out.println(table +" x "+i+" = "+mul*i);
        }

    }
}
