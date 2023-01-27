import java.util.Scanner;

public class Practice_36a {
//    Linear Search In Array

    int i,flag=0,key,j,position ,a[]=new int[10];
    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array element");
        for (i=0;i<10;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter a number to search");
        key=sc.nextInt();
    }
    void search(){
        for (i=0;i<10 && flag==0;i++){
            if (a[i]==key){
                flag=1;
                position=i+1;
            }
        }
            if (flag==1) System.out.println("Number found at position " +position);
            else System.out.println("Number not found");
    }
    public static void main(String[] args) {
Practice_36a aa=new Practice_36a();
aa.getdata();
aa.search();
    }
}
