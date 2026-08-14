package _4inheritanceEx04;

public class Usemanager {
    public static void main(String[] args) {
        Manager m=new Manager("Ashish",500000,100000);

        System.out.println("Mannager name : "+m.getName());
        System.out.println("Income " +m.getIncome());
    }
}
