import java.util.Scanner;

/*

WAP to check number is prime or not

*/


public class Question02 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter an integer");
        int n = kb.nextInt();
        if (n < 2) {
            System.out.println(n + " is prime : false ");
            System.exit(0);
        }
        boolean flag=true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        System.out.println(n + " is prime : "+flag);
    }
}
