/*

WAP to accept integers from user and print its last value.

*/

import java.util.Scanner;

class Question03 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter an Integer");
        int k = kb.nextInt();
        int l = k % 10;
        System.out.println("last digit of number is "+l);
    }
}
