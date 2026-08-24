
public class inverted_tringle {
     public static void main(String[] args) {
        int row=5;
        for (int i = row; i>0; i--) {
            for (int o = row; o > i; o--) {
                  System.out.print(" ");
            }
            for (int k = 0; k < i*2-1; k++) {
                  System.out.print("*");
            }
           System.out.println();
        }
    }
}
