package WrapperClasses;

public class wrapDemo {



    static void main(String[] args) {
        Integer i = Integer.valueOf(10);
        System.out.println(i);


   Integer a =20;
   String a1=a.toString();
        System.out.println(a1 + " Integer to String ");



         Integer s1=128;
         Integer s2 = 128;
        System.out.println(s1==s2); // false
        // -128 to 127 cash return true

        Integer s4=127;
        Integer s5 = 127;
        System.out.println(s1==s2); // True
        // -128 to 127 cash return true

        Integer s6=128;
        Integer s7 = 128;
        System.out.println(s6.equals(s7)); // true

        int a3= Integer.parseInt("1222");
        // String to integer then int

        double a4=9.33;
        int a5 = (int) a4;

        Integer a11= 222;
        String a12= a11.toString();
        System.out.println(a12);
    }
}
