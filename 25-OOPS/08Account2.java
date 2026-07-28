class Account2 {
    Account2() {
        System.out.println("Account Constructor called ");
    }
}

class UseAccount2 {
    int a;
    public static void main(String[] args) {
        Account2 obj = new Account2();
    }
}