package Practice_Set;

import java.util.Scanner;

public class Practice_set6 {
    public static void main(String[] args) {
//  Fill in a letter template which looks like bellow:
//  Letter="Dear<|name|>, Thanks a lot"
//  Replace<|name|> with a string(some name)
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String letter="Dear <|name|>, Thanks a lot";
        System.out.println(letter);
        letter=letter.replace("<|name|>",s);
        System.out.println(letter);
    }
}
