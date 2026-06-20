//WAP to accept intergers from user untill 0 is provided 
//display the sum of all integers before 0

import java.util.Scanner;

class H_Example22 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int sum = 0;
        for (;;) {
            int n = kb.nextInt();
            if (n == 0)
                break;
            sum += n;
            
        }
       System.out.println("the sum is "+sum);
    }
}
