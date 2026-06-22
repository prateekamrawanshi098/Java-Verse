class H_Example5 {
    public static void main(String[] args) {
    int [] arr={10,20,30,40,50};
    for (int i : arr) {
        System.out.println(i);
        i += 2;
    }
    System.out.println("After ");
    for (int i : arr) {
        System.out.println(i);
    }
}    
}

//Thus for each only used in traversing and could not perform modification.