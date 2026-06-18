//Write a program to accept intger from user and find its factorial

import java.util.Scanner;

class Example11 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int i = 2;
        int fact = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        System.out.println(fact);
    }
}
