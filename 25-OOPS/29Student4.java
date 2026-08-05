class Student4 {
    static int x = 10;
    
    Student4() {
        System.out.println("Constructor called");
    }
    
    static {
        System.out.println("static block called ");
    }
}


class UseStudent4 {
    public static void main(String[] args) {
        System.out.println(Student4.x);
        Student4 s1 = new Student4();
        Student4 s2 = new Student4();
        Student4 s3 = new Student4();

    }
}