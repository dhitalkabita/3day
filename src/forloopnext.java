import java.util.Scanner;

public class forloopnext {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Loop repeated:");
        int max = scanner.nextInt();

        for (int i = 1; i <= max; i++) {
            System.out.println(i);

        }
    }
}