// WAP to calculate average sales by salesman
// and find the best salesman

import java.util.Scanner;

class I_Example8 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("How many salesmen are there?");
        int n = kb.nextInt();

        int[][] arr = new int[n][];

        // Input
        for (int i = 0; i < n; i++) {

            System.out.println("Enter number of sales by salesman " + (i + 1));
            int a = kb.nextInt();

            arr[i] = new int[a];

            System.out.println("Enter sales values by salesman " + (i + 1));

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        int maxSales = 0;
        int bestSalesman = 0;

        // Calculate average and find best salesman
        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }

            double avg = (double) sum / arr[i].length;

            System.out.println("Average sales by salesman "
                    + (i + 1) + " is " + avg);

            if (sum > maxSales) {
                maxSales = sum;
                bestSalesman = i + 1;
            }
        }

        System.out.println("\nBest salesman is "
                + bestSalesman
                + " with total sales of "
                + maxSales);

        kb.close();
    }
}