 class Math {
     public void add(int a, int b) {
         int c = a + b;
         System.out.println("Sum of " + a + " " + b + " is " + c);
     }
    
     public void add(String s1, String s2) {
         String s = s1 + s2;
         System.out.println("Conctaination of " + s1 + " and " + s2 + " is " + s);
     }
     
     public void add(int a, int b, int c) {
         int d = a + b + c;
         System.out.println("Sum of " + a + " and " + b +" and "+c+ " is " + d);
     }
     }



     class UseMath {
        public static void main(String[] args) {
            Math m = new Math();
            m.add(10, 20);
            m.add("happy", "ness");
            m.add(10, 20, 30);

        }
     }