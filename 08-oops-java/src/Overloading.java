
// Method Overloading
class calculate{
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}

public class Overloading {
    static void main(String[] args) {
        calculate a1=new calculate();

       int a= a1.add(12,12);
        System.out.println(a);

         a= a1.add(12,12,13);
        System.out.println(a);

       double  b= a1.add(1.22,1.22);
        System.out.println(b);
    }

}
