class Ovld {
    public void show(int i) {
        System.out.println("Show of int : " + i);
    }

    public void show(short s) {
        System.out.println("Show of short : " + s);
    }

    public void show(long l) {
        System.out.println("Show of long : " + l);
    }

    public void show(float f) {
        System.out.println("Show of float : " + f);
    }

    public void show(String s) {
        System.out.println("Show of String : " + s);
    }
}


class UseOvld {
    public static void main(String[] args) {
        Ovld obj = new Ovld();
        obj.show(10); //int
        obj.show('A'); //int
        obj.show(1.5f); //float
        obj.show((byte) 25); //short
        obj.show("JAVA"); //String
    }
}
