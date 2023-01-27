package Practice_Set;
import java.util.Scanner;
public class Practice_set7 {
    public static void main(String[] args) {
//Write a java program to detect double and triple spaces in a string
        Scanner sc=new Scanner(System.in);
//        String s=sc.next();
        String s="Dipak kumar  Gouda    ok";
        System.out.println(s.indexOf("  "));
        System.out.println(s.indexOf("    "));
    }
}
