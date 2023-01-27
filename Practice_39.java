import java.util.Random;

//Generating random Number
public class Practice_39 {
    public static void main(String[] args) {
        Random r=new Random();
        int x=r.nextInt(2);
        System.out.println("You Rolled A: "+x);
        if (x==1) System.out.println("Win!!");
        else System.out.println("Loss!!");
    }
}
