public class Car {

    //fields ,attributes,properties
    String color;
    String name;
    int speed;

    //behaviour(methods) ,actions
    public void run(){
        System.out.println("car color: "+color+" car name: "+name+" speed: "+speed);
    }
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.color = "black";
        c1.name = " fourtunar";
        c1.speed = 230;
        c1.run(); // method call
    }
}
