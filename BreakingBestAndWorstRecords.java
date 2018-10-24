//Reference: https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
//"Must return an integer array containing the numbers of times she broke her records. 
// Index 0 is for breaking most points records, and index 1 is for breaking least points records."
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BreakingBestAndWorstRecords {

    static int[] breakingRecords(int[] scores) {
    	//The first value in the scores[] will always be both the min and the max until further investigation
        int min=scores[0], max=scores[0];
        
        //count[0]==maxCounter, count[1]==minCounter
        int [] count = new int[2];
        
        //For loop which checks each index of scores[] and updates the minimum and maximum values in count[]
        for(int i=0; i<=scores.length-1; i++)
        {
            if(scores[i]>max)
            {
                max=scores[i];
                count[0]++;
            }
              if(scores[i]<min)
            {
                min=scores[i];
                count[1]++;
            }
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
