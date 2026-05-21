class CapSmall2 {
    public static void main(String[] args) {
        char ch = args[0].charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("it is a capital letter");
        }
        else if(ch>='a' && ch<='z')
            System.out.println("It is small letter");
        else if(ch>='0' && ch<='9')
            System.out.println("it is an digit");
        else 
            System.err.println("It is something else");
    }
    }

