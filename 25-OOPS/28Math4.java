class Math4 {
    public static void add(int a, int b) {
        System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
    }
    
    public static void max(int a ,int b) {
        if(a>b)
            System.out.println(a + " is greater");
        else 
            System.out.println(b+ " is greater");
    }
}


class UseMath4 {
    public static void main(String[] args) {
        Math4.add(10, 20);
        Math4.max(10,20);
    }
}