package loop;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=kb.nextInt();
        int org=n;
        int sum=0;
        while(n>0){
            int a=n%10;
            sum+=factorial(a);
            n=n/10;
        }
        if(org==sum)
          System.out.println("Number is strong number ");
        else
            System.out.println("Number is not strong number");
    }

    public static int factorial(int a){
        int fact=1;
        while(a>1){
            fact*=a;
            a--;
        }
        return fact;
    }

}
