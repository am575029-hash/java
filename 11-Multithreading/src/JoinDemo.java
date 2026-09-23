
class JoinMethod extends Thread{
    @Override
    public void run() {
        for(int i=1; i<6; i++){
            System.out.println("child thread");
        }
    }
}

public class JoinDemo
{
    static void main(String[] args) throws InterruptedException {
          JoinMethod t1= new JoinMethod();
          t1.start();
          t1.join();  // jo thread join ko call karega vahi wait karega

          for(int i=1; i<6; i++){
               System.out.println("main thread");
          }
    }
}
