/*

WAP to check number is strong number or not

*/

import java.util.Scanner;

class StrongNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int b = n;
        int sum = 0;
        while (n > 0) {
            int fact = 1;
            int a = n % 10;
            for (int i = a; i > 1; i--) {
                fact *= i;
            }
            sum += fact;
            n /= 10;
        }
        System.out.println("is "+b+ " is strong number ?"+(sum==b));
    }
}