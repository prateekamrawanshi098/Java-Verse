/*

WAP to accept integers from user and print its first value.

*/

import java.util.Scanner;


class Question04 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter an integer");
        int k = kb.nextInt();
        while (k > 9) {
            k = k % 10;
        }
        System.out.println("last digit of number is "+k);
    }
}
