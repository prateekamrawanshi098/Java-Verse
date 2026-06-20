class H_Example33 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = n; i >= 1; i--) {

            // spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // ascending part
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }

            // descending part
            for (int j = n - 1; j >= i; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
