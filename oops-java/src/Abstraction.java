abstract class ATM {

    // Essential feature — user ko sirf ye pata hai
    abstract void withdraw(int amount);

    // Normal method
    void checkBalance() {
        System.out.println("Balance checking...");
    }
}

class SBIATM extends ATM {

    // Internal implementation
    void withdraw(int amount) {
        System.out.println("₹" + amount + " withdrawn from SBI ATM");
    }
}

public class Main {
    public static void main(String[] args) {

        ATM atm = new SBIATM();

        atm.withdraw(500);
        atm.checkBalance();
    }
}