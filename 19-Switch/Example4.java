/*======================MODERN SWITCH========================== */

class Example4 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        switch (n) {
            case 1 -> {System.out.println("Monday");
                System.out.println("start of week");
            }
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 ->System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid Input");
        }
    }
}


//For multiple statement braces are compulsory