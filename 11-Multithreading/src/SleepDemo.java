
class SleepMethod extends Thread{
    @Override
    public void run() {
        for (int i=1; i<6; i++){
            System.out.println(getName()+"---->"+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

public class SleepDemo {
    static void main(String[] args) {
    SleepMethod t1=new SleepMethod();
    t1.setName("Child 1");
    t1.start();
    }
}
