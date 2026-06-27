/*

WAP to accept an integer from user and print the sum of its first and last digit ..

*/

import java.util.Scanner;


class Question05 {

    public static void main(String[] args) {
    
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter an integer");
        int k = kb.nextInt();
        int a = k%10;
        while( k>9){
            k /= 10;
        }
        System.out.println("Sum of first digit " + k + " and last digit " + a + " is " + (a + k));
    }    
}
