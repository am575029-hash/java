package ExecutorServiceDemo;

public class massegeSender implements Runnable {

    String name;

    massegeSender(String name){
        this.name=name;
    }
    @Override
    public void run() {
        System.out.println(name +" massage sand Successful by  " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

    }
}
