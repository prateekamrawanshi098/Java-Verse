package loop;

/*happy number*/

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner kb= new  Scanner(System.in);
        System.out.println("Enter a number");
        int num=kb.nextInt();
        int slow=num;
        int fast=digitSquareSum(slow);

        while(slow!=fast){
            slow=digitSquareSum(slow);
            fast=digitSquareSum(digitSquareSum(fast));

            if (fast==1)
                break;
        }

        if(fast==1){
            System.out.println("It is a Happy number");
        }
        else System.out.println("Not an Happy number");

    }

    public static int digitSquareSum(int n){
        int sum=0;
        while(n>0) {
            int rem = n % 10;
            sum += rem * rem;
            n /= 10;
        }
        return sum;
    }

}
