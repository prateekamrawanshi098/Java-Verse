class AbsoluteValue {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = (n >= 0) ? n : -n;
        System.out.println("Absolute value of "+n+" is "+r);
    }
}
