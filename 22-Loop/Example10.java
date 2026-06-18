import java.util.Scanner;

////Wap to take interger n from user and print sum 1 to n in 2 variable

class Example10 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n;
            n--;
        }
        System.out.println(sum);
    }
}
