
class YieldMethods extends Thread{
    @Override
    public void run() {
        for (int i=1; i<10; i++){
            System.out.println(Thread.currentThread().getName() +"--->"+ i);
            Thread.yield();
        }

    }
}
public class YieldDemo {
    static void main(String[] args) {
        YieldMethods t1=new YieldMethods();
        YieldMethods t2=new YieldMethods();

        t1.start();
        t2.start();
    }
}
