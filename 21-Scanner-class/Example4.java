import java.util.Scanner;

class Example4 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a character");
        char c = kb.next().charAt(0);
        System.out.println("You Entered "+c);
    }
}
