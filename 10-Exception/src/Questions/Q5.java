package Questions;

public class Q5 {
    static void main(String[] args) {
        System.out.println("hello "+ m1());
    }

    public static int m1(){
        try {
            return 100;
        } catch (Exception e) {
            return 20;
        }finally {
            return 10;
        }
    }
}
