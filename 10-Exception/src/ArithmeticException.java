public class ArithmeticException {
    static void main(String[] args) {
        System.out.println("Before Exception ");

        try {
            int a = 10/0; // ArithmeticException ---> Runtime ---> Exception
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("After Exception ");
    }
}
