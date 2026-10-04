package fanctionalInterface;


@FunctionalInterface
public interface Calsy {
    int add(int a,int b);

}

class Driver {

    static void main(String[] args) {
        Calsy sum = (a,b)->  a+b;
        System.out.println(sum.add(2,3));
    }
}