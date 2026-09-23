
class addition{
    int sum=0;
     synchronized  void add(){
        sum=sum+1;
    }
}

class mythread2 extends Thread {
addition add;
    mythread2(addition add){
      this.add = add;
    }

    @Override
    public void run() {
        for (int i =0; i<=1000; i++){
            add.add();
        }
    }
}

public class Synchronize {
    static void main(String[] args) throws InterruptedException {
        addition addition= new addition();
        mythread2 m1= new mythread2(addition);
        mythread2 m2= new mythread2(addition);
        m1.start();
        m2.start();
        m1.join();
        m2.join();
        System.out.println("final result :" +addition.sum);

    }
}
