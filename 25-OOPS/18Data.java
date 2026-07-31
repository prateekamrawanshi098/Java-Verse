class Data {
    private int x, y;

    public void setData(int i, int j) {
        x = i;
        y = j;
    }

    public void showData() {
        System.out.println("x=" + x + "\ny=" + y);
    }

    public void inc(Data D) {
        D.x++;
        D.y++;
    }
}


class UseData {
    public static void main(String[] args) {
        Data obj = new Data();
        obj.setData(10, 20);
        System.out.println("Before inc");
        obj.showData();
        Data temp = new Data();
        temp.inc(obj);
        System.out.println("After increament");
        obj.showData();
    }
}