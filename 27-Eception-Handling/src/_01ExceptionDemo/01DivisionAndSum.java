package _01ExceptionDemo;

import java.util.Scanner;

class DivisionAndSum {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter first number ");
        int f=kb.nextInt();
        System.out.println("Enter second number");
        int s=kb.nextInt();
        try{
            int d=f/s;
            System.out.println("div is "+d);
        }catch (ArithmeticException ex){
            System.out.println("denominator cannot be zero .");
        }

        int sum=f+s;
        System.out.println("Sum is "+sum);
    }
}
