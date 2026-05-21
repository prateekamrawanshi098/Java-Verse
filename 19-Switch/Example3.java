//WAp to accept an expression in the following from command line arg and dispaly its result 
//Ex:
//java Example3 10 + 5
//sum is 15
 class Example3 {
    public static void main(String[] args) {
        int o1 = Integer.parseInt(args[0]);
        char op = args[1].charAt(0);
        int o2 = Integer.parseInt(args[2]);

        switch (op) {
            case '+':
                System.out.println("Sum is "+(o1 + o2));
                break;
            case '-':
                System.out.println("Diff is "+(o1 - o2));
                break; 
            case '*':
                System.out.println("Multiplication is "+(o1 * o2));
                break;

            case '/':
                
                  if (o2 == 0)
                   System.out.println("Cannot divide by zero");
                   else
                      System.out.println("Division is " + (o1 / o2));
                    break;
            case '%':
                System.out.println("remainder is "+(o1 % o2));
                break;

                default: System.out.println("Invalid Operator");
        }
    }
}
