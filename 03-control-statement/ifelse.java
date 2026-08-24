import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter marks: ");
     int marks= sc.nextInt();

    if(marks>30){
    System.out.println("PASS");

    }else{
        System.out.print("Fail");
    }

}
}