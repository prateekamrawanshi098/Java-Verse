class Emp3{
    private int id;
    private String name;
    private double sal;
    private static int nextId = 1;;

    Emp3(String n, double s) {
        name = n;
        sal = s;
        id = nextId++;
    }
    
    public void showEmp() {
        System.out.println("id:" + id + "\nname:" + name + "\nsalary:" + sal+"\n------------------------------------------");
    }
    
    public static void showNextId() {
        System.out.println("id of next employee will be " + nextId);
    }
    
    
    public static void destrutor() {
        --nextId;
    }
}

class UseEmp3 {
    public static void main(String[] args) {
        Emp3.showNextId();

        {
            Emp3 e1 = new Emp3("Raghav", 20000);
            Emp3 e2 = new Emp3("Amit", 40000);
            Emp3 e3 = new Emp3("Chetan", 50000);

            e1.showEmp();
            e2.showEmp();
            e3.showEmp();

            Emp3.showNextId();

            {
                Emp3 x = new Emp3("Shubham", 10000);
                Emp3 y = new Emp3("Sonam", 13000);
                x.showEmp();
                y.showEmp();
                Emp3.showNextId();
                x = y = null;
                Emp3.destrutor();
                Emp3.destrutor();
            }
            Emp3.showNextId();
            e1 = e2 = e3 = null;
            Emp3.destrutor();
            Emp3.destrutor();
            Emp3.destrutor();

        }

        Emp3.showNextId();

    }
    
    

}