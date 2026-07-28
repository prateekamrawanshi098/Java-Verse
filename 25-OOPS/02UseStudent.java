class Student1 {
    private int roll;
    private char grade;
    private double per;

    public void setStudent() {
        roll = 10;
        grade   = 'A';
        per=78.9;
    }

    public void showStudent() {
    System.out.println("Roll = "+roll+"\ngarde = "+grade+"\nper = "+per);
    }
}

class UseStudent1 {
    public static void main(String[] args) {
        Student1 s = new Student1();
        s.setStudent();
        s.showStudent();
    }
}
