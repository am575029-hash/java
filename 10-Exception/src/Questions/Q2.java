package Questions;

public class Q2 {
    static void main(String[] args) {
        try {
            int a=100/0;             //ArithmeticException
            System.out.println("try block run");
        }catch (Exception e){
            System.out.println(e); // run this block
        }finally {
            System.out.println("Done..");
        }
    }
}
