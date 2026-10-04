

class MythreadsA extends Thread{
   int k=0;

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("child thread start .............");
            for (int i = 1; i < 100; i++) {
                k = k + 1;
            }
            System.out.println("child thread end .............");
            this.notify();

        }
    }
}

public class WaitandNotify {
    static void main(String[] args) throws InterruptedException {
    Thread m1=new MythreadsA();
      m1.start();
      synchronized (m1){
          System.out.println("main thread start.....");
          m1.wait();
          System.out.println("main thread end......");

      }


    }
}
