class Emp4 {
    private int id;
    private String name;
    private double sal;

    Emp4(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public void showEmp() {
                System.out.println("id :"+id+"\nname : "+name+"\nsalary : "+sal);

    }

}



class UseEmp4 {
    public static void main(String[] args) {
        Emp4 e = new Emp4(12, "Ravi", 10000);
        e.showEmp();
    }
}


/*

internally java convert it into this

public void showEmp() {
    System.out.println("id :" + this.id +
                       "\nname : " + this.name +
                       "\nsalary : " + this.sal);
}

*/