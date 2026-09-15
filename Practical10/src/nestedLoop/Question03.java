package nestedLoop;

public class Question03 {
    public static void main(String[] args) {

        for (int i = 5; i >=1 ; i--) {

            for (int j = 5; j >i ; j--) {
                System.out.print(" ");
            }

            for (int j = i; j >=1 ; j--) {

                if (j==1 || i==j || i==5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }


    }
}
