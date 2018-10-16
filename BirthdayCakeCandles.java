//Reference: https://www.hackerrank.com/challenges/birthday-cake-candles/problem
//"You are in charge of the cake for your niece's birthday and have decided the cake will have one candle for each year of her total age. When she blows out the candles,
// she’ll only be able to blow out the tallest ones. Your task is to find out how many candles she can successfully blow out."
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BirthdayCakeCandles {
	
    static int birthdayCakeCandles(int[] ar) {
	    
    	//Set max to a negative value initially to ensure we evaluate the true max accurately
        int max=-1;    
        int maxCount=0;
        
        for(int i : ar)
        {
	    //If the given value is greater than or equal to the current max, save it in a temporary max value
	    //Furthermore, increment maxCount. This variable will be returned once the whole array is explored.
            if(i>=max && i!=0)
            {
                max=i;
                maxCount++; 
            }
            else{
            	//Do nothing 
            }
        
        }
        return maxCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
