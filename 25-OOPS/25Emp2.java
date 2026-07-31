class Emp2{
    private int id;
    private String name;
    private double sal;
    private static int nextId = 1;;

    Emp2(String n, double s) {
        name = n;
        sal = s;
        id = nextId++;
    }
    
    public void showEmp() {
        System.out.println("id:" + id + "\nname:" + name + "\nsalary:" + sal+"\n------------------------------------------");
    }
    
    public void showNextId() {
        System.out.println("id of next employee will be " + nextId);
    }
    
    @Override
    protected void finalize() {
        --nextId;
    }
}

class UseEmp2 {
    public static void main(String[] args) {
        Emp2 e1 = new Emp2("Raghav", 20000);
        Emp2 e2 = new Emp2("Amit", 40000);
        Emp2 e3 = new Emp2("Chetan", 50000);

        e1.showEmp();
        e2.showEmp();
        e3.showEmp();

        e1.showNextId();

        {
            Emp2 x = new Emp2("Shubham", 10000);
            Emp2 y = new Emp2("Sonam", 13000);
            x.showEmp();
            y.showEmp();
            y.showNextId();
            x = y = null;
            System.gc();
            System.runFinalization();
        }
        e1.showNextId();
    }
    
    

}