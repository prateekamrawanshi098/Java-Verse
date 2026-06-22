//WAP to create an array in java of size 5 , accept values from user and display sum and avg of values.

import java.util.Scanner;

class Example1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int sum = 0;
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = kb.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum is " + sum);
        System.out.println("average is "+(double)sum/arr.length);
    }
}