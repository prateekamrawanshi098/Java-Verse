package _11interfaceneewfeatures;

public interface Shape {
    void area();
    default void volume(){
        System.out.println("This shape has no volume");
    }

    static void welcome(){
        System.out.println("WELOCME TO MY APP");
    }
}

class Rectangle implements Shape{
    int l,b;

    public Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    @Override
    public void area() {
        System.out.println("Area of rectangle is "+(l*b));
    }
}

class Cylinder implements Shape{

    public Cylinder(int rad, int h) {
        this.rad = rad;
        this.h = h;
    }

    int rad, h;

    @Override
    public void area() {
        System.out.println("Area of cylinder is "+2*Math.PI*rad*rad+2* Math.PI*rad*h);
    }

    @Override
    public void volume() {
        System.out.println("Volume of cylinder is "+Math.PI*rad*rad*h);
    }
}

class UseShape{
    public static void main(String[] args) {
        Shape.welcome();
        Shape s=new Rectangle(10,20);
        s.area();
        s.volume();

         s=new Cylinder(10,20);
        s.area();
        s.volume();
    }
}

