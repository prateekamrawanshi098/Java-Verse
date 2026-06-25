import java.util.Scanner;

class Example3 {
    public static void main(String[] args) {
             Scanner kb = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = kb.nextInt();
        System.out.println("Enter second number");

        int b = kb.nextInt();
        System.out.println("Sum of "+a+" and "+b+" is "+add(a, b));
}
    
    public static int add(int a, int b) {
        return a + b;    
    }
}
