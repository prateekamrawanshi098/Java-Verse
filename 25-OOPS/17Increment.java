 class Increment {
     public void increament(int x, int y) {
           x  +=5;
           y += 5;
    }
}


class UseIncreament {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        
        System.out.println("Before increment");
        System.out.println("x="+x+"\ny="+y);
        Increment i = new Increment();
        i.increament(x, y);
         System.out.println("After increment");
        System.out.println("x="+x+"\ny="+y);
        
    }

}