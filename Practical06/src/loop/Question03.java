package loop;

// find LCM of two numbers


import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int max=Math.max(a,b);

        while (true){
            if(max%a==0 && max%b==0){
                System.out.println(max);
                break;
            }
            max++;
        }
    }
}
