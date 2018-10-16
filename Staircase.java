//Reference: https://www.hackerrank.com/challenges/staircase/problem
//"Write a program that prints a staircase of size n."
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Staircase {

    static void staircase(int n) 
    {
	   int counter=0;
	   for(int i=0; i<n;i++)
	   {
	       counter++;
	       for(int k=n; k>= i;k--)
	       {
	           System.out.print(" "); 
	       } 
	       for(int j=0; j<=counter-1;j++) 
	       {
	           System.out.print("#");
	       }
	
	       System.out.print("\n");
	   }
} 

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
