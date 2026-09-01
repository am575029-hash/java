//method overriding.........
class Animals{
    void sound(){
        System.out.println("hahuuuuu");

    }
}
class cow extends Animal{

    @Override
    void sound() {
        System.out.println("cow mata");
    }
}

class rat extends Animal{
    @Override
    void sound() {
        System.out.println("rat mauuuuuuu");
    }
}

public class Overriding {
    static void main(String[] args) {
        cow any=new cow();
        any.sound();
        rat ra=new rat();
        ra.sound();
    }
}
