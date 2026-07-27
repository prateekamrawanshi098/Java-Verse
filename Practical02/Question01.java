

import java.util.Scanner;

class Question01 {
   

   public static void main(String[] var0) {
      Scanner kb = new Scanner(System.in);
      System.out.println("Enter an integer");
      int n = kb.nextInt();
      int k = n;

      int reverse=0;
      while (n>0) {
          reverse = (reverse * 10) + n % 10;
          n /= 10;
      }

      if (k == reverse) {
         System.out.println("Palindorme");
      } else {
         System.out.println("Not Palindrome");
      }

   }
}
