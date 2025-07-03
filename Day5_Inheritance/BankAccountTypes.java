package Day5_Inheritance;
class accounts {
    int acc_num;
    double balance;
}

class saving extends accounts {
    double interest;
    void display() {
        System.out.println("Savings Account");
    }
}

class Check extends accounts {
    double limit;
    void display() {
        System.out.println("Checking Account");
    }
}

class Fixed extends accounts {
    int time;
    void display() {
        System.out.println("Fixed Deposit Account");
    }
}

public class BankAccountTypes {
    public static void main(String[] args) {
        new saving().display();
        new Check().display();
        new Fixed().display();
    }
}
