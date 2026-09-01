public class Encapsulation {

    private String name;
    private int age;
    void setName(String name){
           this.name=name;
    }
    void setAge(int age){
        this.age=age;
    }
    void showName(){
        System.out.println(this.name);
    }
    void showAge(){
        System.out.println(this.age);
    }
}

class main {
   public static void main(String[] args) {
        Encapsulation s1=new Encapsulation();
        s1.setName("Abhi");
        s1.setAge(20);
        s1.showName();
        s1.showAge();
    }
}