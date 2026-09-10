package Questions;

public class Q6 {
    static void main(String[] args) {
        System.out.println("hello "+ m1());
    }

  public static int m1(){
        try {
            return 100;
        }
        finally {
            System.out.println("finally....");
        }

  }
}
