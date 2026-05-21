// Clubbing of Cases
// ==================

// WAp to accept a month from command line arg.Now print the name of the season in which the given month falls.


class Example2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        switch(n){
            case 12: case 11: case 1: case 2:
                System.out.println("Winter season");
                break;

            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Summer season");
                break;

            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("rainy season");
                break;

            default: System.out.println("Wrong Input");
        }
    }
}
