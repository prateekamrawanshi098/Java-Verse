import java.util.Scanner;

class G_Example19 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int fact = 1;
        for (;;) {
            if (n <= 1) {
                break;
            }
            fact = fact * n;
            n--;
        }
        System.out.println(fact);
    }
}
