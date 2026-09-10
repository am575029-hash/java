package ThrowDemo;

public class ThrowTest {
    static void main(String[] args) {
          try {
              withdraw(1000,2000);
          } catch (Exception e) {
              System.out.println(e.getMessage());
          }
    }
    public static void withdraw(int bla , int amt) throws Exception{
        if(amt>bla){
            throw new Exception("Insufficent balance");
        }
        System.out.println("Withdrawal Successful...");
    }
}
