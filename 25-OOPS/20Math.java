import java.util.Scanner;

class Math2 {
    public int sumArray(int[] brr) {
        int total = 0;
        for (int x : brr) {
            total += x;
        }
        return total;
    }
}


class UseMath2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a number");
            arr[i] = kb.nextInt();
        }
        Math2 obj = new Math2();
        int result =obj.sumArray(arr);
        System.out.println("Sum of Array elements are "+result);
    }
}