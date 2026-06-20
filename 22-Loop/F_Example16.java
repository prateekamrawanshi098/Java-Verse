//WAP a program to take 2 integers from user and dispaly/print their sum .Then ask user if they want to repeat the process if "yes" repeat otherwise terminate the programme

import java.util.Scanner;

class F_Example16 {
    public static void main(String[] args) {
        String r;
        Scanner kb = new Scanner(System.in);
        do {
            System.out.println("Enter the first number ");
            int f = kb.nextInt();
            System.out.println("Enter the second number ");
            int s = kb.nextInt();
            System.out.println("The sum for first and second number is " + (f + s));
            System.out.println("Do u want to repeat the process ");
            kb.nextLine();
            r = kb.nextLine();
        } while (r.equals("yes"));
    }
}

//nextLine method of Scanner class also captures the Enter we press 
//no other method does this 
//so to clear the buffer from Enter we need to use to nextLine ---one for Enter and other for user input
