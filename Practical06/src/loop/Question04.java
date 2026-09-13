package loop;

// LCM using GCD

import java.util.Scanner;

public class Question04 {

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=kb.nextInt();
        int b=kb.nextInt();

        int LCM= (a*b) / gcd(a,b);
        System.out.println("LCM of "+a+" and "+b+" is "+LCM);
    }

    private static int gcd(int a, int b) {
        while(b!=0){
            int rem = a%b;
            a=b;
            b=rem;
        }
        return a;
    }

}
