class Account {
    private int accID=100657817;
    private String accName="Prateek";
    private double accBalance = 50000;

    public void showAccountDetails() {
        System.out.println("Account Id : " + accID + "\nAccount Holder Name : "+accName+"\nAccount balance : "+accBalance);
    }
}


class UseAccount {
    public static void main(String[] args) {
        
        Account obj = new Account();
        obj.showAccountDetails();
    }
}