//See https://www.hackerrank.com/challenges/a-very-big-sum/problem for reference

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AVeryBigSum {

    static long aVeryBigSum(long[] ar, int length) 
        {
    		//If array is empty, sum is 0
            if (length <= 0) 
                return 0; 
            //Otherwise, recursively add the long values together to get the result
            return (aVeryBigSum(ar, length-1) + ar[length - 1]); 
        } 

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long[] ar = new long[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            long arItem = Long.parseLong(arItems[i]);
            ar[i] = arItem;
        }
            
        int length =ar.length;
        
        long result = aVeryBigSum(ar,length);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();

        scanner.close();
    }
}
