package ExceptionHandling;

import java.util.Scanner;

public class NestedTryCatch {
    int a,b;
    int x[];
    NestedTryCatch()
    {
        a=b=0;
        x=new int[10];
    }
    NestedTryCatch(int a, int b)
    {
        this.a=a;
        this.b=b;
        x=new int[10];
        for(int i=1;i<x.length;i++)
            x[i-1]=i;
    }
    void func()
    {
        int i=0;
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Outer Catch Block");

            try
            {
                System.out.println("Inner Catch Block");
                for(i=0;i<=10;i++,b--)
                    System.out.println(x[i]/b);
            }

            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Exception caught in Inner Catch Block");
                System.out.println("Array Index out of Bounds");
                System.out.println(e.getMessage());
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception caught in Inner Catch Block");
            System.out.println(e.getMessage());
        }
    }
}
