public class Practice_17_String {
    public static void main(String[] args) {
        //Write a program to get the character(Unicode code point)at the given index within the String.

        String sr=new String("blaablakablasabladablatubla");
        System.out.println("Original string "+sr);

        int a1=sr.codePointAt(1);
        int a2=sr.codePointAt(10);
        System.out.println("Character (Unicode Point) "+a1);
        System.out.println("Character (Unicode Point) "+a2);
    }
}
