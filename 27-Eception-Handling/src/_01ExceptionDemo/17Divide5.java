package _01ExceptionDemo;

import java.util.Scanner;

class NumeratorCantBeZeroException2 extends Exception{
    NumeratorCantBeZeroException2(String s){
        super(s);
    }

}


class Divide5 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter 2 numbers ");
        int a=kb.nextInt();

        int b= kb.nextInt();
        try{
            if(a<=0){
                NumeratorCantBeZeroException2 ex=new NumeratorCantBeZeroException2("Numerator must not be 0");
                throw ex;
            }
            int c=a/b;
            System.out.println("Divsion is "+c);
        }catch (ArithmeticException | NumeratorCantBeZeroException2 e){
            System.out.println(e.getMessage());
        }
       
    }
}
