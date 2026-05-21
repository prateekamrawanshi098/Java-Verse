/*=============CLUBBING IN MODERN SWITCH========== */
 class Example5 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        switch (n) {
            case 1, 2 -> System.out.println("Start of the week");
            case 3, 4 -> System.out.println("Middle of week");
            case 5, 6, 7 -> System.out.println("End of week");
            default-> System.out.println("Invalid input");
        }
    }
}
