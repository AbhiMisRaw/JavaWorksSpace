package ExceptionHandling;

public class ThrowException {
    void print(){
        try {
            throw new ArithmeticException("Exception is caught");
        }
        catch (ArithmeticException e ){
            System.out.println(e.toString());
            try{throw e;}
            catch (Exception p){
                System.out.println(p.getMessage());
            }
        }
    }
}
