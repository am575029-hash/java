class Animal{
    String name;
    void eat(){
        System.out.println("animal eat food");
    }
    void sound(){
        System.out.println("hahuuuuu");

    }
}
class Dog extends Animal{

    @Override
    void sound() {
        System.out.println(name+" bsdk");
    }
}

class Cat extends Animal{
    @Override
    void sound() {
        System.out.println(name+" mauuuuuuu");
    }
}

public class inheritance {
    static void main(String[] args) {
    Dog dog1=new Dog();
    dog1.name="DOG";
    dog1.eat();
    dog1.sound();

    Cat cat =new Cat();
    cat.name= "Billi";
    cat.eat();
    cat.sound();
    }
}
