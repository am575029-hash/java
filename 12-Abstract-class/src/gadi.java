public interface gadi {

    void color();
    void name();

}
class thar implements gadi{

    @Override
    public void color() {
        System.out.println("red");
    }

    @Override
    public void name() {
        System.out.println("thar");
    }

}
 class Mains{
    static void main(String[] args) {
       gadi c1=new thar();
       c1.color();
       c1.name();


    }
}