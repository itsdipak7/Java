package Practice_Set;

public class Practice_set11 {
    public static void main(String[] args) {
//  Calculate the average marks from an array containing marks of all
//  students in physics using a for-each loop

        int [] marks={24,12,34};
        float avg=0;
        for (int i=0;i<marks.length;i++)
        {
            avg=(avg+marks[i])/3;
        }
        System.out.println(avg);


    }
}
