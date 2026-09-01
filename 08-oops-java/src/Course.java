public class Course {

    String name;
    int duration;

// here Course method is Parametrized constructor .
    Course (String name , int duration){
        System.out.println("parametrized Constructor call......");
        this.name=name;
        this.duration=duration;
    }

   public static void main(String[] args) {

        Course  c1=new Course("java-full-stack",120); //create object

        Course  c2=new Course("data-structure",100);  //create object


        c1.learn();
        c2.learn();
    }

    void learn(){
        System.out.println("we learn "+name+", duration: "+duration);
    }
}

