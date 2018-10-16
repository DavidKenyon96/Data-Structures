//Reference: https://www.hackerrank.com/challenges/counting-valleys/problem
//"Print a single integer that denotes the number of valleys Gary walked through during his hike."
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {
    
    static int countingValleys(int n, String s) {
        int valleyCount=0, upCount=0, downCount=0;
        
        for(char c : s.toCharArray())
        {
            //If down, decrease downCount
            if (c == 'D')
                --downCount; 
            //If up, increase upCount
            if (c == 'U')
                ++upCount;
            //If just returned to sea level, increase valleyCount
            if (upCount+downCount==0 && c=='U')
                ++valleyCount;
        }
        return valleyCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new                                             FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
