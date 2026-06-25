import java.util.Scanner;

class Example4 {
     public static void main(String[] args) {
         Scanner kb = new Scanner(System.in);
         System.out.println("Enter 1st no. ");
         int a = kb.nextInt();
         System.out.println("Enter 2nd no. ");
         int b = kb.nextInt();
         System.out.println("Sum of " + a + " and " + b + " is " + add(a, b));
         System.out.println("division of "+a+" and "+b+" is "+div(a, b));
     }
    
     public static int add(int a, int b) {
         return a + b;
     }

     public static double div(int a, int b) {
         return (double) a / b;
     }
}
