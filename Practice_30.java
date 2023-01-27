
public class Practice_30 {
    public static void main(String[] args) {
// Write a program to print all prime number between 1 to 100
        int i, count, total = 0;
       for (i=1;i<=100;i++)
       {
           count=0;
           for (int j=1;j<=i;j++)
           {
               if (i%j==0)
                   count++;
           }
           if (count==2){
               System.out.println(i+" Is A Prime Number");
           total=total+1;}
           else
               System.out.println(i+" Is Not A Prime Number");
       }
        System.out.println("Total Prime Number Is : "+total);
    }
}