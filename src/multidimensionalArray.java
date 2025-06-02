public class multidimensionalArray {
    public static void main(String[] args) {
// 2D array = An array where each element is an array.
        //useful for storing a matrix of data

        int[][] myArr = new int[2][3];
  int[][] arr = {{1,2,3},{4,5,6}};
      //  System.out.println(arr[0].length);

        int i=0;                //loop
        while (i < arr.length){
            int j =0;
            while( j < arr[i].length){
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
