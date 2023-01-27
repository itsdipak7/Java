import java.util.Scanner;
class reverse{
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        int i;
         public void reverse(){
        for ( i=st.length()-1;i>=0;i--){
            System.out.println(st.charAt(i));
        }
        }

}
public class Practice_37 {
    public static void main(String[] args) {
        reverse r=new reverse();
        r.reverse();
        System.out.println("End of program");
    }
}
