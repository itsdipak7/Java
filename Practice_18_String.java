public class Practice_18_String {
    public static void main(String[] args) {
        //Write a java program to get the character at the given index within the string.

        String str=new String("Dipak Kumar Gouda");
        System.out.println("Original String "+ str);
        int Index1=str.codePointBefore(1);
        int Index2=str.codePointBefore(10);

        System.out.println("The character at the position  0 is "+ Index1);
        System.out.println("The character at the position  10 is "+Index2);
    }
}
