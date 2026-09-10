package Questions;

public class Q1 {
    static void main(String[] args) {
        try {
            System.out.println("hi i am try "); // No exception
        }catch (Exception e){
            System.out.println("hi i am catch"); // no run this block
        }finally {
            System.out.println("hi i am finally");
        }
    }
}
