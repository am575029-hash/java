package Lembdafunction;

public class lembdatest {
    static void main(String[] args) {
        Runnable test = ()-> System.out.println("Hello i am lembda function");
        new Thread(test).start();
    }
}
