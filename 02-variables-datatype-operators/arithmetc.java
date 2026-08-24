import java.util.Scanner;

public class arithmetc {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         System.out.println("enter a:");
        int a= sc.nextInt();
        
        System.out.println("enter b:");
        int b= sc.nextInt();

        int sum=a+b;
        System.out.println("sum= "+sum);
         int sub=a-b;
        System.out.println("sub= "+sub);
         int multiply=a+b;
        System.out.println("multiply= "+multiply);
         int divide=a/b;
        System.out.println("divide= "+divide);
         int remendar=a%b;
        System.out.println("remendar= "+remendar);

        sc.close();
    }
}
