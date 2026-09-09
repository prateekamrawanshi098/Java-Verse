package _01ExceptionDemo;

import java.util.Scanner;

class Divide3 {
     public static void main(String[] args) {
         Scanner kb=new Scanner(System.in);
         System.out.println("Enter 2 numbers ");
         int a=kb.nextInt();

         int b= kb.nextInt();
         try{
             if(a<=0){
                  ArithmeticException ex=new ArithmeticException("Numerator must not be 0");
                  throw ex;
             }
             int c=a/b;
             System.out.println("Divsion is "+c);
         }catch (ArithmeticException e){
             System.out.println(e.getMessage());
         }
     }
}
