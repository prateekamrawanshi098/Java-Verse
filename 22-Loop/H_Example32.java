public class H_Example32 {
    public static void main(String[] args) {
        for (int i = 4; i >= 1; i--) {

            // spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // numbers
            for (int j = i; j <= 4; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
