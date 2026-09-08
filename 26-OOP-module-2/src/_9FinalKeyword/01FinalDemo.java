package _9FinalKeyword;

class Circle {
    int radius;
    final double pi;

    Circle(int radius){
        this.radius=radius;
        pi=3.14;
    }

    public void area(){
        System.out.println(pi*radius*radius);
    }

    public void circumference(){
        System.out.println(2*pi*radius);
    }
}

class UseCircle{
    public static void main(String[] args) {
         Circle cir=new Circle(12);
         cir.area();
         cir.circumference();
    }
   
}