package ExceptionHandling;

public class ExceptionInFunction {
    int a, b;
    int arr[];

    ExceptionInFunction(){
        a = b = 0;
        arr = new int[10];
    }
    ExceptionInFunction(int a , int b){
        this.a = a ;
        this.b = b ;
        arr = new int[b];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = i*2 ;
        }
    }
    void fun (){
        int i = 0 ;
        for(i = 0 ; i <= arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
