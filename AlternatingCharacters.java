//Reference: https://www.hackerrank.com/challenges/alternating-characters/problem
//"It must return an integer representing the minimum number of deletions to make the alternating string."
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AlternatingCharacters {

    static int alternatingCharacters(String s) {
        
        int counter=0;
        
        for (int j = 0; j < s.length()-1; j++)
        {
            if(s.charAt(j) == s.charAt(j+1))
            {
                counter++;
            }
        }
        
        return counter;
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
