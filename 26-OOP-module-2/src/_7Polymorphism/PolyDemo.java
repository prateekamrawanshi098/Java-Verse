package _7Polymorphism;

public class PolyDemo {

    public static void main(String[] args) {
        Parent p=new Parent();
        p.show();
        p.display();

        Parent c=new Child();
        c.show();
        c.display();
    }

}
