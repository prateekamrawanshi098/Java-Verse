package _10interface;

import java.util.spi.AbstractResourceBundleProvider;

public interface Shape {
    String getName();
    double getArea();
}

class Circle implements Shape{
    int radius;

    Circle(int radius){
        this.radius=radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getArea() {
    return Math.PI * radius *radius;

    }
}


class Rectangle implements Shape{
    int length;
    int breadth;

    Rectangle(int breadth, int length){
        this.length=length;
        this.breadth= breadth;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return length*breadth;
    }
}

class UseShape{
    public static void main(String[] args) {
        Shape s;
        s=new Circle(10);
        System.out.println("Name of shape is "+s.getName());
        System.out.println("Area of shape is "+s.getArea());

        s=new Rectangle(10,10);
        System.out.println("Name of shape is "+s.getName());
        System.out.println("Area of shape is "+s.getArea());
    }

}