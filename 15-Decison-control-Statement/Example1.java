// WAP to accept an integer from command line arg 
// and check whether it is positive or negative. 
// Assume that the user will not input 0


// Example
// ========

// java PosNeg 5
// Number is positive
// java PosNeg -5
// Number is negative
// java PosNeg 0
// number is 0


class PosNeg {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        if (a==0) {
            System.out.println("a is zero");
        }else
        if (a>0)
            System.out.println("a is positive");
        else {
            System.out.println("a is negative");
        }
    }
}