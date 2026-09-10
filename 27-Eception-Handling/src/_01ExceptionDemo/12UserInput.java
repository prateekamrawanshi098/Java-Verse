package _01ExceptionDemo;

import java.awt.desktop.ScreenSleepEvent;
import java.io.IOException;
import java.util.Scanner;

class UserInput {
    public void acceptInt(){
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=kb.nextInt();
        System.out.println("You entered "+n);
    }
    public void acceptChar() throws IOException {
        System.out.println("Enter a character");
        char ch=(char)System.in.read();
        System.out.println("You Entered "+ch);
    }
}

class UseInput{
    public static void main(String[] args) throws IOException{
        UserInput input=new UserInput();
        input.acceptInt();
        input.acceptChar();
    }
}
