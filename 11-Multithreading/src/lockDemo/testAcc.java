package lockDemo;

public class testAcc {
    static void main(String[] args) {
        Runnable t1=  ()-> Account.withdraw(500,"papa");
        Runnable t2=  ()-> Account.withdraw(1000,"mummy");


        new Thread(t1).start();
        new Thread(t2).start();

    }
}
