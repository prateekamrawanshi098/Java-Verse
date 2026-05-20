//WAP to accept a char and check wheather it is a vowel or not

public class VowelOrNot {

    public static void main(String[] args) {
        char c = args[0].charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("character is vowel");
        }
        else
            System.out.println("character is consonant");
    }
}