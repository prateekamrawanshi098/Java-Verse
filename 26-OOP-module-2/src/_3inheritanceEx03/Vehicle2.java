package _3inheritanceEx03;

 class Vehicle2 {
     public Vehicle2(int x) {
         this((double)x);
         System.out.println("int constructor called ...");
     }

     public Vehicle2(double d) {
        System.out.println("double constructor called");
     }
 }

 class Car2 extends Vehicle2{
     public Car2() {
         super(10);
         System.out.println("Car constructor called ...");
     }
 }

 class UseCar2{
     public static void main(String[] args) {
         Car2 c=new Car2();
     }
 }
