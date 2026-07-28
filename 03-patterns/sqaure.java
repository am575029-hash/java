public class sqaure {
    public static void main(String[] args) {
        int row=4;
        for (int i = 0; i < row; i++) {


            for (int j = i; j < row; j++) {
                System.out.print(" ");
                
            }
            for (int k = 0; k < row; k++) {
                  System.out.print("* ");
            }
          System.out.println();
        }
    }
}
