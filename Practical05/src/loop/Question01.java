package loop;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        System.out.println("Enter a number");
        int num=kb.nextInt();
        int a=digitSqareSum(num);
        while(a>=10){
             a=digitSqareSum(a);
        }
        if (a==1 || a==7){
            System.out.println("Happy number");
        }
        else
            System.out.println("Not Happy number");
    }

    private static int digitSqareSum(int num) {
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum+=rem*rem;
            num/=10;
        }
        return sum;
    }
}
