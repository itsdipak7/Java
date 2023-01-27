

        //Write a java method to find the smallest number among three number.


        import java.util.Scanner;

        public class Practice_19_Method {
            public static double smallest(double x,double y,double z){
                return Math.min(Math.min(x , y),z);
            }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number : ");
        double x=sc.nextDouble();
        System.out.println("Enter second number : ");
        double y=sc.nextDouble();
        System.out.println("Enter third number : ");
        double z=sc.nextDouble();

        System.out.println("The smallest number is :" +smallest(x,y,z));
    }
}
