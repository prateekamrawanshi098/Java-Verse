package loop;

//GCD or HCF

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter two number ");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int num=Math.min(a,b);
        int flag=1;
        for (int i = num; i >=2 ; i--) {
            if (a%i==0 && b%i==0){
                flag=i;
                break;
            }
        }
        System.out.println("GCD of "+flag);
    }
}
