//WAP to accept interger from user and print sum of all even no. and odd no. seperately

import java.util.Scanner;

class Example13 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = kb.nextInt();
        int even = 0, odd = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                even += n;
            } else {
                odd += n;
            }
            n--;
        }
        System.out.println("Sum of even is " + even);
        System.out.println("Sum of odd is "+odd);
    }
}
