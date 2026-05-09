
     void main() {
        IO.println("Hello from new main");
    }

    public static void main(String[] args) {
        System.out.println("Hello from old main");
    }


//from JDK 25
//  main-method  prototype reduced to void main()
//we dont even have to create class 
// instead of System.out we can use IO class for printing 
//u can directly give command java <file_name> also called compact source file
//jvm internally wrap it into a class same name of file.
//java can create instance of main when see simpilified main it is also called instance main method
//IO class is a part of java.lang package and -- IO.println() is static method
//jvm gives priority to traditional main when multiple main clashes