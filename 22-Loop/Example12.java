import java.util.Scanner;

import org.xml.sax.SAXException;

////Write a program to accept intger from user and find its factorial using 2 variable
 
class Example12 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int fact=1;
        while (n > 1) {
            fact *= n;
            n--;
        }
        System.out.println(fact);
    }
}
