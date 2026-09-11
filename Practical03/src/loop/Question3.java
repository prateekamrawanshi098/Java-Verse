package loop;
/* Harshad number --> number whose sum of digits divide the number completely */


import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=kb.nextInt();
        int org=n;
        int sum=sumDigit(n);
        int a=org%sum;
        System.out.println((a==0)? "Harshad Number":"Not Harshad number");
    }

    private static int sumDigit(int n) {
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
