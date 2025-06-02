import java.util.Scanner;

public class Arraysearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 11, 6, 7, 9, 6, 8, 4, 7, 5, 3, 2, 6, 5};
        System.out.println("ArraySearch Task \n");
        System.out.println("Enter the array you want to search: ");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if (isFound) {
            System.out.println("Your Number is found in this array!");
        } else {
            System.out.println("Your Number is not found in this array!");
        }
    }

    public static boolean isFound( int[]arr, int num){ //method create
int index =0;                   //loop
while (index < arr.length){

    if (arr[index] == num){
        return true;
    }  index++;
}
        return false;
    }
}
