//Reference: https://www.hackerrank.com/challenges/simple-array-sum/problem
//"Given an array of integers, find the sum of its elements."
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class SimpleArraySum {

    static int simpleArraySum(int[] ar,int n) {
       if (n<=0)
           return 0;
       //Recursively add all elements in the array
       return (simpleArraySum(ar,n-1) + ar[n-1]);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(scanner.nextLine().trim());

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int n = ar.length;
        int result = simpleArraySum(ar,n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
}
