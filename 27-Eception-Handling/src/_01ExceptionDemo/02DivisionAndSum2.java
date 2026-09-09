package _01ExceptionDemo;

import java.util.InputMismatchException;
import java.util.Scanner;
 class DivisionAndSum2 {
    public static void main(String[] args) {
        int f=0;
        int s=0;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter first number ");
        try{
         f=kb.nextInt();
        System.out.println("Enter second number");
         s=kb.nextInt();
        int d=f/s;
        System.out.println("div is "+d);
        }catch (ArithmeticException ex){
            System.out.println("denominator cannot be zero .");
        }
        catch (InputMismatchException ex){
            System.out.println("Only digits are allowed");
            System.exit(0);
        }

        int sum=f+s;
        System.out.println("Sum is "+sum);
    }
}
