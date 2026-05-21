 class CapSmall {
    public static void main(String[] args) {
        char ch = args[0].charAt(0);
        if (ch >= 65 && ch <= 90) {
            System.out.println("it is a capital letter");
        }
        else if(ch>=97 && ch<=122)
            System.out.println("It is small letter");
        else if(ch>=48 && ch<=57)
            System.out.println("it is an digit");
        else 
            System.err.println("It is something else");
    }
}
