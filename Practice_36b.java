import java.util.Scanner;
//Binary Search
public class Practice_36b {
    int i,key;
    int a[]=new int[10];
    void getdata(){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter array element");
        for(i=0;i<10;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter number to find ");
        key=sc.nextInt();
    }
    void search(){
        int i=0,j=10,flag=0,position=0;
        while (i<=j && flag==0){
            int mid=(i+j)/2;
            if(a[mid]==key){
                flag=1;
                position=mid+1;
            }
            if(a[mid]>key){
                j=mid-1;
            }
            if(a[mid]<key){
                i=mid+1;
            }


        }
            if (flag==1)
                System.out.println("Number found at position "+position);
                else
                    System.out.println("Number not found");
    }

    public static void main(String[] args) {
Practice_36b aa=new Practice_36b();
aa.getdata();
aa.search();
    }
}
