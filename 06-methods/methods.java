public class methods {

// type 1. no parameter,no return method.
public  void hello(){
    System.out.println("Hello ");
}


// type 2. with parameter,no return method.
public  void name(String name){
    System.out.println("Hello "+name);
}

// type 3. no parameter,with return method.
public String otpGen(){

    return "1234";
}
// type 4. with parameter,with return method.
public int sum(int a,int b){

    return a+b;
}


    public static void main(String[] args) {
         methods s=new methods();
        s.hello();  // method calling.......
        s.name("Abhi");
        String otp=s.otpGen();
        System.out.println("otp: "+otp);
        int sum=s.sum(12,13);
        System.out.println("sum: "+sum);
    }
}
