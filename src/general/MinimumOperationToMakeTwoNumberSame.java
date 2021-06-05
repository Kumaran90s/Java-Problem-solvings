package general;
/**
 * For any two numbers, the minimum operations to be done to make two numbers same.
 * --------------------------------------------------------------------------------
 */
import java.util.*;
import java.lang.*;
import java.io.*;

public class MinimumOperationToMakeTwoNumberSame {
    static int findMin(int A, int B){

        if(A > B){
            A= A+B;
            B=A-B;
            A=A-B;
        }

        B = B/GCD(A,B);

        return (B-1);
    }

    static int GCD(int a, int b){

        return b==0?a:GCD(b,a%b);
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        int a = 10, b= 25;

        System.out.println(findMin(a,b));
    }
}
