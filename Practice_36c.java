import java.util.Scanner;

public class Practice_36c {
    //    Insertion Sort In Array
    int a[]= {1,21,22,31,11,4,8,6,90,16};
//    void getdata()
//    {
//        int i;
//        Scanner sc=new Scanner(System.in);
//        for (i=0;i<10;i++){
//            System.out.println(a[i]);
////            a[i]=sc.nextInt();
//        }
//    }
    void putdata(){
        int i;
        for (i=0;i<10;i++)
            System.out.println(a[i]);

    }
    void sort()
    {
        int i,j=0,val=0;
        for (i=1;i<10;i++)
        {
            val=a[i];
            j=i-1;
            while(val<a[j])
            {
                a[j+1]=a[j];
                j--;
                if(j==-1)
                    break;
            }
            a[j+1]=val;

        }

    }
}
 class demo36{
    public static void main(String[] args) {


        Practice_36c  aa=new Practice_36c ();

        System.out.println("Before sorting");
        aa.putdata();

        System.out.println("After sorting");
      aa.sort();
      aa.putdata();

    }
}
