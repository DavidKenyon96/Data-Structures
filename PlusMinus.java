//Reference: https://www.hackerrank.com/challenges/plus-minus/problem
//"Given an array of integers, calculate the fractions of its elements that are positive, 
// negative, and are zeros."
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {

    static void plusMinus(int[] arr) {
    	
        double pos=0,neg=0,zero=0;
        double zeroShare=0,posShare=0,negShare=0;
        double length = arr.length;
        
        //For loop to iterate through array and classify each value as pos, neg, or zero
        for (int i =0; i<length; i++)
        {
            if (arr[i]==0)
            {
                ++zero;
            }
            else if (arr[i]>0)
            {
                pos++;
            }
            else if  (arr[i]<0)
            {
                neg++;
            } 
          
        }
        zeroShare = zero/length;
        posShare = pos/length;
        negShare = neg/length;
  
        System.out.println(posShare  + "\n" +negShare  + "\n" +  zeroShare + "\n");
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
