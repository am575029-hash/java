import java.lang.ArithmeticException;

public class NullPointerException {
    static void main(String[] args) {
        String S1=null;
        try {
            int lenght = S1.length();
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (java.lang.NullPointerException e){
            System.out.println(e);
        }
    }
}
