 class Box {
    private int length;
    private int breadth;
    private int heigth;

    Box() {
        length =breadth=heigth= 0;
       
    }

    Box(int side) {
        length = breadth = heigth = side;
    }

    Box(int l, int b, int h) {
        length = l;
        breadth = b;
        heigth = h;
    }

    Box(Box P) {
        length = P.length;
        breadth = P.breadth;
        heigth = P.heigth;
    }

    void show() {
        System.out.println("length : " + length + "\nbreadth : " + breadth + "\nheigth : " + heigth);
        System.out.println("-----------------------------------------------------------------");
    }
     

}



class UseBox {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(9);
        Box b3 = new Box(10, 20, 30);
        Box b4 = new Box(b3);
        b1.show();
        b2.show();
        b3.show();
        b4.show();
    }
}