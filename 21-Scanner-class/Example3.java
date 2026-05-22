import java.util.Scanner;

class Example3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your first name : ");
        String name = kb.next();
        kb.nextLine();
        System.out.println("Enter your fullname ");
        String fullname = kb.nextLine();
        System.out.println("hello " + fullname);
        kb.close();
    }
}


//to accept single word use next()
//to accept input string carring spaces use nextLine()
//use nextLine for handling Enter in buffer
