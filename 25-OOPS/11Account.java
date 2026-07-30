

class Account {
    private int accID;
    private String accName;
    private double accBalance;
    
    Account(int id, String name,double balance) {
        accID = id;
        accName = name;
        accBalance = balance;
    }

    public void showAccountDetails() {
        System.out.println("Account Id : " + accID + "\nAccount Holder Name : "+accName+"\nAccount balance : "+accBalance);
    }
}


class UseAccount5 {
    public static void main(String[] args) {
        
        Account obj1 = new Account(101,"Prateek",500000);
        obj1.showAccountDetails();

        Account obj2 = new Account(102, "manish", 200000);
        obj2.showAccountDetails();
    }
}