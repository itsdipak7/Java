package Practice_Set;

public class Practice_set10 {
    public static void main(String[] args) {
//  Find out whether a given integer is present in an array or not
        float[] num={23.4f,24.34f,23.4f,21.45f};
        float num2=23.7f;
        boolean isINArray=false;
        for (float element:num){
            if (num2==element) {
                isINArray = true;
                break;
            }
        }
        if (isINArray) System.out.println("The value is present in the array");
        else System.out.println("The value is not present in the array");
    }
}
