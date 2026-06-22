//WAP to accept  integers from command line arg and dispaly their sum. If number passed
// are less then 2 then dispaly message "atleast 2 numbers are required"

class G_Example3 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("atleat 2 numbers are required");
            System.exit(0);
        }
         {
                    int sum = 0;
            for (int i = 0; i < args.length; i++) {
                sum += Integer.parseInt(args[i]);
            }
            System.out.println("Sum is "+sum);
        }
        
    }
}
