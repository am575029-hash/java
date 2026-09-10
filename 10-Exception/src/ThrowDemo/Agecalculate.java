package ThrowDemo;

public class Agecalculate {
    static void main(String[] args) {
           try {
               agecal(18);

             }catch (Exception e){
               System.out.println(e.getMessage());
           }
    }

    public static void agecal(int age) throws Exception{
        if(age<0){
            throw new Exception("Age cannot be negative");
        }
        if(age<18 && age >0){
            throw new Exception("you are underAge");
        }

        System.out.println("you are adult ");
    }
}

