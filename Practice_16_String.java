public class Practice_16_String {
    public static void main(String[] args) {
        //Write a java program to get the character at the given index within the string.

        String str=new String("Dipak Kumar Gouda");
        System.out.println("Original String "+ str);
        int Index1=str.charAt(0);
        int Index2=str.charAt(10);

        System.out.println("The character at the position  0 is "+ (char)Index1);
        System.out.println("The character at the position  10 is "+(char) Index2);
    }
}
