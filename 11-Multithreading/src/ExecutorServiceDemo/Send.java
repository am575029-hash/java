package ExecutorServiceDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Send {
    static void main(String[] args) {
        ExecutorService s= Executors.newFixedThreadPool(3);
        String []studentlist={"Abhi","Raj","Aman","prem","anu","ajeet","Riya"};


       for(String name:studentlist){
         massegeSender Task = new massegeSender(name);
         s.submit(Task);
       }
        s.shutdown();

    }
}
