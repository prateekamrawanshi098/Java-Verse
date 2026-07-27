import java.util.Scanner;

/*

Check Armstrong number

*/

class Question03 {
public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.println("Enter a number ");
    int n = kb.nextInt();
    int k=n,m = n;
    int count = 0;
    while (n > 0) {
        count++;
        n /= 10;
    }

    int sum = 0;
     
    while (m > 0) {
        sum += Math.pow(m % 10, count);
        m /= 10;
    }

    if (k==sum) {
        System.out.println("It is an armstrong number");
    }
    else {
        System.out.println("Not an armstrong number");
    }

}    
}
