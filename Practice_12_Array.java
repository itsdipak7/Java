import java.util.Arrays;


public class Practice_12_Array {
    public static void main(String[] args) {

        //Java Array Exercises: Sort a numeric array and a string array


        int a[]={23,55,2,552,232,215,123,123,242,63,4};
        String s[]={"Michle","Trevor","Francklin","John"};
        System.out.println("Without sorting numeric array"+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("In sorting numeric array"+Arrays.toString(a));

        System.out.println();

        System.out.println("Without sorting string array"+Arrays.toString(s));
        Arrays.sort(s);
        System.out.println("In sorting string array"+Arrays.toString(s));

    }
}
