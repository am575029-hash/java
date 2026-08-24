
public class Student {

       String name="Abhi";
       int age=20;
     static String course="java";

    public static void main(String[] args) {
        Student S1= new Student();


        System.out.println("Name: "+S1.name);
        System.out.println("age: "+ S1.age);
        System.out.println("Course: "+ Student.course);
    }
}
