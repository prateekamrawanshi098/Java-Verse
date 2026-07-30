/*
Initialization using constructor
*/

class Account {
    private int accID;
    private String accName;
    private double accBalance;
    
    Account() {
        accID = 101;
        accName = "Prateek";
        accBalance = 500000;
    }

    public void showAccountDetails() {
        System.out.println("Account Id : " + accID + "\nAccount Holder Name : "+accName+"\nAccount balance : "+accBalance);
    }
}


class UseAccount4 {
    public static void main(String[] args) {
        
        Account obj = new Account();
        obj.showAccountDetails();
    }
}