class Student2 {
    private int roll;
    private char grade;
    private double per;

    public void setStudent(int r,char g,double p) {
        roll = r;
        grade   = g;
        per=p;
    }

    public void showStudent() {
    System.out.println("Roll = "+roll+"\ngarde = "+grade+"\nper = "+per);
    }
}

class UseStudent2 {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.setStudent(10,'A',54.8);
        s1.showStudent();
        Student2 s2 = new Student2();
        s2.setStudent(20, 'B', 43);
        s2.showStudent();
    }
}
