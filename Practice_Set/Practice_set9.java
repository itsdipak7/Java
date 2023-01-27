package Practice_Set;

public class Practice_set9 {
    public static void main(String[] args) {
//  Create an array of 5 floats and calculate their sum
        float []num={11.5f, 12.4f, 13.6f, 9.9f};
        float sum=0;
        for (int i=0;i<num.length;i++){
            sum=sum+num[i];
            System.out.println(num[i]);
        }
        System.out.println("Some of above numbrs is "+sum);
    }
}
