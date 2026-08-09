package _1inheritanceEx01;

class Manager extends Emp {
    private double bonus;

    public void setBonus(double bonus) {
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
