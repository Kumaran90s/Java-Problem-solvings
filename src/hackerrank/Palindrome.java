package hackerrank;

/**
 * Palindrome
 * ---------------
 */
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        StringBuilder sb = new StringBuilder();
        sb.append(A);
        sb.reverse();
        if(A.equals(sb.toString())){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
