/*WAP to calculate hypotenuse using Pythogoras theoram . Assume 
perpendicular and base to be type int and initialize them with any value
of your choice
*/



 class Pythogoras {
    public static void main(String[] args) {
        int perpendicular = 10;
        int base = 4;
        double hypotenuse = Math.sqrt((perpendicular * perpendicular) + base * base);
        System.out.println(hypotenuse);
    }
}
