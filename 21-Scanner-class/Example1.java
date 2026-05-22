import java.util.Scanner;

class Example1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter First no. ");
        int n = kb.nextInt();
         System.out.print("Enter Second no. ");
         int m = kb.nextInt();
         int c = n + m;
         System.out.println("Sum of "+n+" and "+m+" is"+c );
    }
}

//Scanner class throws InputMismatchException if we user give incompatible type of input .

//while Wrapper classes give NumberFormatException

//reason is same but due to different classes they give different exception