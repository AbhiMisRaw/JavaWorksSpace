package ExceptionHandling;

public class UserDefinedException extends  Exception{
    UserDefinedException(){
        System.out.println("User Defined Constructor is called");
    }
    public String toString(){
        return "UserDefinedException" ;
    }
}
