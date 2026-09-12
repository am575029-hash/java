
class MytaskTheard implements Runnable{
    @Override
    public void run() {
        System.out.println("runnable.........");
    }
}

public class ThreadInInterface {
    static void main(String[] args) {
      Thread t= new Thread(new MytaskTheard());
      t.start();
    }
}
