package ThrowsDemo;

import java.io.FileReader;

import static java.lang.System.*;

public class ThrowsTest {
    static void main(String[] args) {
            m1();
    }

    public static void m1() {
       try {
           System.out.println("m1");
           m2("test.tex");

       } catch (Exception e){

           System.out.println(e);
       }
    }
    public static void m2(String name) throws Exception {
        System.out.println("m2");
        FileReader fileReader= new FileReader(name);
    }
}
