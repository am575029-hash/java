public class ExceptionDepth {
  public static void main(String[] args) {
        m1();
    }

    public static void m1(){
        m2();
        System.out.println("hi m1 hu");

    }
    public static void m2(){
        m3();
        System.out.println("hi m2 hu");


    }
    public static void m3(){
        int a=10/0;
        System.out.println("hi m3 hu");

    }
}
