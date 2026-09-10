package _01ExceptionDemo;

import java.util.Scanner;

class NumeratorCantBeZeroException extends Exception{
    NumeratorCantBeZeroException(String s){
        super(s);
    }

}


class Divide4 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter 2 numbers ");
        int a=kb.nextInt();

        int b= kb.nextInt();
        try{
            if(a<=0){
                NumeratorCantBeZeroException ex=new NumeratorCantBeZeroException("Numerator must not be 0");
                throw ex;
            }
            int c=a/b;
            System.out.println("Divsion is "+c);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (NumeratorCantBeZeroException ex){
            System.out.println(ex.getMessage());
        }
    }
}
