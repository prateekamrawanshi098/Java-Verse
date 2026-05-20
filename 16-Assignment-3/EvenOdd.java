//Wap to accept an int from command line arg and check wheather its an even number or odd number . Consider 0 to be an even number

 class EvenOdd {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n % 2 == 0) {
            System.out.println("Number is even");
        }
        else
            System.out.println("number is odd");
    }
}
