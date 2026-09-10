package _01ExceptionDemo;

import java.util.Scanner;

class FinallyDemo{
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=kb.nextInt();
        try{
            System.out.println("Enter second number");
            int b=kb.nextInt();
            int c=a/b;
            System.out.println("Div is "+c);
        }catch (ArithmeticException ex){
            System.out.println("Denominator should not be zero");
        }
        finally{
            System.out.println("Have a good Day !");
        }
    }
}