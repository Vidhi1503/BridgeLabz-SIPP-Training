package Day3_Level_1_Lab_Practice;

public class account {
    static String bankName = "SBI";
    static int totalAccounts = 0;
    final int accountNumber;
    String accountHolderName;

    account(String name, int number) {
        this.accountHolderName = name;
        this.accountNumber = number;
        totalAccounts++;
    }
    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }
    void show() {
        if (this instanceof account)
            System.out.println(accountHolderName + ", Acc No: " + accountNumber);
    }
}

