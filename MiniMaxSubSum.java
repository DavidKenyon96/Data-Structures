//Reference: https://www.hackerrank.com/challenges/mini-max-sum
//"Given five positive integers, find the minimum and maximum values 
// that can be calculated by summing exactly four of the five integers."

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MiniMaxSubSum {

    static void miniMaxSum(int[] arr, int n) {
    	
    	//Max int value for the very large and very small numbers that might show up in test-cases
    	long max=-2147483647;
        long min=2147483647;
        long sum=0;
        
         for (int i : arr)
         {  
        	//Find sum of all values in array
            sum += i; 
            
            //Find value of Max
	        if (i >= max)
	        {
	            max=i;
	        } 
	        //Find value of Min
	        if (i <= min)
	        {
	            min=i;
	        }
        }
         
         //Remove max value from minimum sub sum value
         long minSubSum=sum-max;
         
         //Remove min value from maximum sub sum value
         long maxSubSum=sum-min;
        
         System.out.println(minSubSum +  " " + maxSubSum);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        int n = arr.length;
        miniMaxSum(arr,n);

        scanner.close();
    }
}
