/*WAP to modify previous Exmaple 

1.Ignore the negative integers.

2.Also display the Average along with sum.

*/

import java.util.Scanner;

class H_Example23 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int sum = 0, count=0;
        for (;;) {
            int n = kb.nextInt();
            if (n < 0)
                continue;
            if (n == 0)
                break;
            sum += n;
            count++;
        }
        System.out.println("Sum is " + sum);
        System.out.println("Average is "+(double)sum/count);
    }
}
