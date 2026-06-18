//Wap to print nos from 1 to n where n should be taken from user

import java.util.Scanner;

class Example7 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a no.");
        int n = kb.nextInt();
        int i=1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
        kb.close();
    }
}
