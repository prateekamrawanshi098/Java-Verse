class Student {
    int roll;
    char grade;
    double per;
}

class UseStudent {
    public static void main(String[] args) {
        Student s = new Student();
        s.roll = 10;
        s.grade = 'A';
        s.per = 79.4;
        System.out.println("Roll = "+s.roll+" \nGrade = "+s.grade+" \nPercentage = "+s.per);
    }
}