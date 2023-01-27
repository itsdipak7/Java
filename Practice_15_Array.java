public class Practice_15_Array {
    public static void main(String args[]){

        //Write a Java Program to calculae the average value of array elements.

        int a[]={2,3,4,5,6,7,8,9,10};
        //calculate sum of all array elements
        int sum=0;
//        for (int i=0;i<a.length;i++){
//            sum =sum+a[i];
//            //calculate averge value
//        }

        for (int i=0;i<a.length;i++)
            sum =sum+a[i];
            //calculate averge value

            double average=sum/a.length;
            System.out.println("Average value of array element is "+average);
    }
}
