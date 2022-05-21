package ExceptionHandling;
import java.util.Scanner;
public class ExceptionCreator {
    int a,b,arr[] ;
    ExceptionCreator(){
        a = b = 0;
        arr = new int[10];
    }
    ExceptionCreator(int a , int b){
        this.a = a;
        this.b = b;
        arr = new int[10];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = i+1 ;
        }
    }
    void fun(){
        int i = 0 ;
        Scanner sc = new Scanner(System.in);
        try{
            for(i = 0 ; i <= arr.length ; i++,b--){
                System.out.println(arr[i]/b);
            }
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            b = sc.nextInt();
            System.out.println(arr[i]/b);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Arrays Index Out Of Bound");
            System.out.println(e.getMessage());
        }
    }
}