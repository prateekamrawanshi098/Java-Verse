package _5inheritanceEx05;

public class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }


    public double getArea() {
        return 2*Math.PI*radius*radius;
    }

    public int getRadius() {
        return radius;
    }
}


class Cylinder extends Circle{
    int height;
    public Cylinder(int radius,int height) {
        super(radius);
        this.height=height;
    }

    public double getArea(){
        return 2*super.getArea()+2*Math.PI*getRadius()*height;
    }

    public double getVolume(){
        return super.getArea()*height;
    }

    public double circularArea(){
        return super.getArea();
    }

}

class UseCylinder{
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder(10,10);
        double area=cylinder.getArea();
        double volume=cylinder.getVolume();
        System.out.println("Area of cylinder = "+area);
        System.out.println("Volume of cylinder = "+volume);
        System.out.println("Area of circular part " +cylinder.circularArea());
    }
}