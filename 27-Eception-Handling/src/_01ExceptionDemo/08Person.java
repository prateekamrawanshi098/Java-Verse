package _01ExceptionDemo;

import java.util.Date;

class Person {
    int age;
    String name;

     public Person(int age, String name) {
         this.age = age;
         this.name = name;
     }
 }

 class UsePerson{
     public static void main(String[] args) {
         Person p=new Person(14,"Amit");
         System.out.println(p);
         String city = new String("Bhopal");
         System.out.println(city);
         Date d=new Date();
         System.out.println(d);
     }
 }