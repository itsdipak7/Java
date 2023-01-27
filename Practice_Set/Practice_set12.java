package Practice_Set;

public class Practice_set12 {
    public static void main(String[] args) {
//  Create a Java Program to add two matrices of size 2x3.
        int [][]array={{2,3,2},{2,3,5}};
         int array2[][]={{23,32,32},{2,3,5}};
         int result[][]={{0,0,0},{0,0,0}};
         for (int i=0;i<array.length;i++){
             for (int j=0;j<array2.length;j++){
                 result[i][j]=array[i][j]+array2[i][j];
                 System.out.println(result[i][j]);
             }
         }
    }
}
