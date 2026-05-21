class Insurance {
    public static void main(String[] args) {
        
        int age = Integer.parseInt(args[0]);
        String gender = args[1];
        String status = args[2];

        if (status.equals("married")) {
            System.out.println("Insurance given");
        } else {
            if (gender.equals("male") && age >= 30) {
                System.out.println("Insurance given");
            } else if (gender.equals("female") && age >= 25) {
                System.out.println("Insurance given");
            }
            else {
                System.out.println("Insurance not given");
            }
        }
    }
    
}