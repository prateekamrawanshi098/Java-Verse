/*

WAM add() which has two paramater both are integers.
It performs addition of these number and display their sum.

Take two integers from user and pass it as arguement to add() method.

*/

import java.util.Scanner;

class Example2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = kb.nextInt();
        System.out.println("Enter second number");

        int b = kb.nextInt();
        add(a, b);
    }
    
    public static void add(int a, int b) {
        System.out.println("The sum of "+a+" and "+b +" is "+(a+b));
    }
}
