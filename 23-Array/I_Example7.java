import java.util.Scanner;

class I_Example7 {
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);

        int[][] arr = new int[3][];

        int sum = 0;

        int count = 0;

        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[4];
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = kb.nextInt();
                sum += arr[i][j];
            }

            count += arr[i].length;

        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("Their sum is " + sum);
        System.out.println("Their average is "+(double)sum/count);
        
        

    }
}
