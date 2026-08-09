package _2inheritanceEx02;

 class Vehicle {
     public Vehicle() {
         System.out.println("Vehicle constructor called ...");
     }
 }

 class Car extends Vehicle{
     public Car() {
         System.out.println("Car constructor called ...");
     }
 }

 class UseCar{
     public static void main(String[] args) {
         Car c=new Car();
     }
 }
