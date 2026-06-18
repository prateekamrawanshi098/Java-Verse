//Wap to take interger n from user and print sum 1 to n

import java.util.Scanner;

class Example9 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println(("Enter a number n"));
        int n = kb.nextInt();
        int sum = 0;
        int i = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
