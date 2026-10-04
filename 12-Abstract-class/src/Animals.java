abstract public class Animals {
    abstract void sound();

}

class cat extends Animals {

    @Override
    void sound() {
        System.out.println("mauuuuuuu......");
    }


}
