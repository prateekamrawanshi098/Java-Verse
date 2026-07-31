class Emp{
    private int id;
    private String name;
    private double sal;
    private static int nextId = 1;;

    Emp(String n, double s) {
        name = n;
        sal = s;
        id = nextId++;
    }
    
    public void showEmp() {
        System.out.println("id:" + id + "\nname:" + name + "\nsalary:" + sal+"\n------------------------------------------");
    }
    
    public void showNextId() {
        System.out.println("id of next employee will be "+nextId);
    }
}

class UseEmp {
    public static void main(String[] args) {
        Emp e1 = new Emp("Raghav", 20000);
        Emp e2 = new Emp("Amit", 40000);
        Emp e3 = new Emp("Chetan", 50000);

        e1.showEmp();
        e2.showEmp();
        e3.showEmp();

        e1.showNextId();
        e2.showNextId();
        e3.showNextId();
    }

}