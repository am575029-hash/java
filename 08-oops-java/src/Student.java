public class Student {

    String name;
    int age;

    Student(){
        this("unknown",0); // this keyword use call current class constructor...
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
     void display(){
         System.out.println(this.name);
         System.out.println(this.age);
    }

    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("abhi",20);
        s1.display();
        s2.display();
    }
}
