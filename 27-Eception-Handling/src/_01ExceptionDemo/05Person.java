package _01ExceptionDemo;

import java.util.Date;

class Person2 {
    int age;
    String name;

     public Person2(int age, String name) {
         this.age = age;
         this.name = name;
     }

    @Override
    public String toString() {
        return "Person2{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

 class UsePerson2{
     public static void main(String[] args) {
         Person2 p=new Person2(14,"Amit");
         System.out.println(p);

     }
 }