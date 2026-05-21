/**Wap to  accept from user .Assuming that all 3 are unique nos ,find out the greatest amongst them .Do not use any Logical Operator */


class Example1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a > b) {
            if (a > c) {
                System.out.println(a + " (a) is greatest");
            } else {
                System.out.println(c + " (c) is greatest");
            }
        } else {
            if (b > c) {
                System.out.println(b + " (b) is greatest");
            } else {
                System.out.println(c + " (c) is greatest");
            }
        }
    }
}

