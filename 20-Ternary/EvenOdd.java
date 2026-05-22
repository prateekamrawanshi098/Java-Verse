class EvenOdd {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String s = (n % 2 == 0) ? "even" : "odd";
        System.out.println(s);
    }
}
