public class nestedloopbest2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 6; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Moves to the next line after each row
        }
    }
}
