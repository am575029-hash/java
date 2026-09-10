package CustomException;

public class Atm {
    static void main(String[] args) {
        try {
            withdraw(2000,4000);
        } catch (InsufficentBalException e) {

            System.out.println(e.getMessage());
        }

    }

    public static void withdraw(int bal,int amt) throws InsufficentBalException{

        if(amt>bal){
            throw new InsufficentBalException("Your balance:" + bal + " Withdraw amt:"+ amt);
        }
        System.out.println("Withdraw Successful...");
    }
}
