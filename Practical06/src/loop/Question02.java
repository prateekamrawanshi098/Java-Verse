package loop;

// GCD using Euclidean algorithm


import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a=kb.nextInt();
        int b=kb.nextInt();


        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }

        System.out.println("GDC of this number is "+a);

    }
}
