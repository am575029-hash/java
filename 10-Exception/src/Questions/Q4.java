package Questions;

public class Q4 {
    static void main(String[] args) {

            try {
                try {

                    int a=100/0; //ArithmeticException

                }catch (ArithmeticException e){

                    System.out.println("inner Catch");
                }
            }catch (Exception e){

                System.out.println(e);
                System.out.println("outer Catch");

            }finally {

                System.out.println("done...");

            }
    }
}
