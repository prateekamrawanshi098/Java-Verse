package _1inheritanceEx01;

public class Usemanager {
    public static void main(String[] args) {
        Manager m=new Manager();
        m.setEmp("Ashish",50000);
        m.setBonus(50000);
        System.out.println("Mannager name : "+m.getName());
        System.out.println("Income " +m.getIncome());
    }
}
