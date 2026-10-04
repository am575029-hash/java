package lockDemo;

import java.util.concurrent.locks.ReentrantLock;

public class Account {
   private static int amount=1000;
  private static final ReentrantLock rl=new ReentrantLock();
  public static void withdraw(int amu, String name) {
      rl.lock();
      System.out.println(name + " try to withdraw....");
      if(amu<=amount){
          try {
              amount = amount-amu;
              Thread.sleep(2000);
              System.out.println("Withdraw successful..");
              System.out.println("Available balances "+ amount);
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
          finally {
              rl.unlock();
          }

      }else {
          System.out.println("insufficient balances");
      }
  }
}
