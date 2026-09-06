class Account {
    String holderName;
    double balance;
    int accountNumber;
    
    static String bankName = "HDFC";
    static int totalAccounts;

    Account(String holderName, double balance, int accountNumber) {
        this.holderName = holderName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    void displayAccountDetails() {
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("Account Number: " + accountNumber);
    }

    static void bankDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Total Accounts: " + totalAccounts);
    }
}

public class ClassesQ19 {
    public static void main(String[] args) {
        Account account1 = new Account("Acc1", 1000.0, 12345);
        Account account2 = new Account("Acc2", 50000.0, 12346);
        Account account3 = new Account("Acc3", 10.0, 12347);
        account1.displayAccountDetails();
        account2.displayAccountDetails();
        account3.displayAccountDetails();
        Account.bankDetails();
    }
}