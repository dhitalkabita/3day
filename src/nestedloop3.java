import java.util.Scanner;

public class nestedloop3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the # of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the # of columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter a symbol to use: ");
        symbol = scanner.next().charAt(0);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println(); // Move to next line after each row
        }

        scanner.close();
    }
}
