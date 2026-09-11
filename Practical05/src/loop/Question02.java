package loop;

import java.util.Scanner;


public class Question02 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=kb.nextInt();
        while(num!=1 && num!=4){
            num=digitSqareSum(num);
        }
        if (num==1){
            System.out.println("Happy number");
        }
        else
            System.out.println("Number is Not happy ");
    }

    private static int digitSqareSum(int num) {
        int sum=0;
        while(num>0){
            int a=num%10;
            sum+=a*a;
            num/=10;
        }
        return sum;
    }
}
