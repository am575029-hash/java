public class ReverseString {
    static void main(String[] args) {
        String s1="Abhinash";
        String reverse ="";

        for(int i=s1.length()-1; i>=0; i-- ){
            reverse += s1.charAt(i);

        }
        System.out.print(reverse);
    }
}
