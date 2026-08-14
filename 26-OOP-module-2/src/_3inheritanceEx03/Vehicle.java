package _3inheritanceEx03;

 class Vehicle {
     public Vehicle(int x) {
         System.out.println("Vehicle constructor called ...");
     }
 }

 class Car extends Vehicle{
     public Car() {
         super(10);
         System.out.println("Car constructor called ...");
     }
 }

 class UseCar{
     public static void main(String[] args) {
         Car c=new Car();
     }
 }
