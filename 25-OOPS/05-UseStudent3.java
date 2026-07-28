import java.util.Scanner;

class Student3 {
    private int roll;
    private String name;
    private double per;

    public void setStudent(int r,String n,double p) {
        roll = r;
        name = n;
        per=p;
    }

    public void showStudent() {
    System.out.println("Roll = "+roll+"\ngarde = "+name+"\nper = "+per);
    }
}

class UseStudent3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Student3 s1 = new Student3();
        System.out.println("Enter roll ,name ,percentage");
        int roll = kb.nextInt();
        String name = kb.next();
        double per = kb.nextDouble();
        s1.setStudent(roll,name,per);
        s1.showStudent();
        kb.close();;
       
    }
}
