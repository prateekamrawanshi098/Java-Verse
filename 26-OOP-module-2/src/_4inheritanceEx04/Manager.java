package _4inheritanceEx04;

class Manager extends Emp {
    private double bonus;

    public Manager(String name, double sal, double bonus) {
        super(name, sal);
        this.bonus = bonus;
    }


    public double getBonus() {
        return bonus;
    }

    public double getIncome() {
        double total;
        total = getSal() + bonus;
        return total;
    }

}
