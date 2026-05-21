
class Example1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}

//fallthrough =condition where java run the true case and every case after it

//to prevent fallthrough we use break keyword


//Switch can aonly old 5 types of data
        // === byte short int char String