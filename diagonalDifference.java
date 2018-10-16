//Reference: https://www.hackerrank.com/challenges/diagonal-difference/problem
//Given a square matrix, calculate the absolute difference between the sums of its diagonals.
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class diagonalDifference {

    // Complete the diagonalDifference function below. 
    static int diagonalDifference(int[][] arr, int length) {
        int rightDownSum=0, leftDownSum=0;
        
        for(int i = 0, j = length-1; i<length; i++, j--)
         {
        	//Explore and sum right-down diagonal
        	rightDownSum += arr[i][i];
            //Explore and sum left-down diagonal
        	leftDownSum += arr[i][j];
          }
        
        //Find absolute value of subtracting the two values
        int result = Math.abs(rightDownSum - leftDownSum);
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int length = arr.length;
        int result = diagonalDifference(arr,length);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
