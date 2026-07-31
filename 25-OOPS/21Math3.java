import java.util.Scanner;

class Math3 {
    public double [] calculate(int[] brr) {
        int total = 0;
        for (int x : brr) {
            total += x;
        }
        double avg =(double) total / brr.length;
        return new double[] { total, avg };
    }
}


class UseMath3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a number");
            arr[i] = kb.nextInt();
        }
        Math3 obj = new Math3();
        double [] result =obj.calculate(arr);
        System.out.println("Sum of Array elements are " + result[0]);
        System.out.println("There avg is "+result[1]);
    }
}