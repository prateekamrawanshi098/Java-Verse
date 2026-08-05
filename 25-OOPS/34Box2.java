class Box2 {
    private int l, b, h;

    public Box2() {
        this(0, 0, 0);
    }

    public Box2(int side){
        this(side,side,side);
      }

      public Box2(int x, int y, int z) {
          l = x;
          b = y;
          h = z;
      }
      
      public void show() {
        System.out.println("l="+l+"\nb="+b+"\nh="+h);
      }
}

class UseBox2 {
    public static void main(String[] args) {
        Box2 b = new Box2(9);
        b.show();
    }
}