package Questions;

public class Q3 {
    static void main(String[] args) {
        int arr[]={10,20};
        try {
            System.out.println(arr[3]); //ArrayIndexOutOfBoundsException
        }catch (Exception e){
            System.out.println(arr[1]);
        }
    }
}
