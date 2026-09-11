package loop;

/* fibonacci series*/

import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter number ");
        int n=kb.nextInt();
        int prev=0;
        int next=1;
        for (int i=0;i<n;i++){
            System.out.print(prev+" ");
            int temp=prev;
            prev=next;
            next=temp+next;
        }
    }
}
