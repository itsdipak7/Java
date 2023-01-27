import java.util.Scanner;

public class Practice_34_Star_Pattern_Tringle {

    public static void main(String[] args) {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
//        Left Tringle
//        for (i=1;i<=n;i++){
//            for (j=1;j<=i;j++)
//                System.out.print("*");
//            System.out.println();
//        }
//        Right Tringle
        for (i=1;i<=n;i++){
            for (j=2*(n-i);j>=1;j--){
                System.out.print("");}
            for(j=1;j<=i;j++){
                System.out.print("*");}
            System.out.println();
        }

    }
}
