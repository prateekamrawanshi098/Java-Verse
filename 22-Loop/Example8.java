//take no from user and print n to 1

import java.util.Scanner;

class Example8 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = kb.nextInt();
        while (n != 0) {
            System.out.println(n);
            n--;
        }

    }
}
