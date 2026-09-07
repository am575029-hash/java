public class immutable {
    static void main(String[] args) {
        String s1 = new String("Java ");
        String s2 = s1.concat("Full Stack");
        System.out.println(s1==s2); //false


    }
}
