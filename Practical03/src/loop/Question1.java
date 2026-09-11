package loop;

/* find number is a armstrong number or not using 1 loop */

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int count=String.valueOf(n).length();
        int org=n;

        int sum=0;
        while(n>0){
            int a=n%10;
            sum+=(int)Math.pow(a,count);
            n=n/10;
        }
        if (org==sum){
            System.out.println("Number is armstrong number");
        }else
            System.out.println("Not a armstrong number");
    }
}
