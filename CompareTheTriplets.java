//Reference: https://www.hackerrank.com/challenges/compare-the-triplets/problem
//"Alice and Bob each created one problem for HackerRank. A reviewer rates the two
// challenges, awarding points on a scale from  to  for three categories: problem clarity, originality, and difficulty."
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CompareTheTriplets {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aScore=0;int bScore=0;
        
        //If the two lists differ in size, there is an issue with the input
        if (a.size()!=b.size())
            System.out.println("input error");
        
        for (int i=0; i<a.size();i++)
        {
            if (a.get(i) == b.get(i))
            {
                //do nothing
            }
            
            //Give 'a' a point if the value of the current index is greater than 'b'
            else if (a.get(i)> b.get(i))
                aScore++;
            
            //Give 'b' a point if the value of the current index is greater than 'a'
            else if (a.get(i)< b.get(i))
                bScore++;
        }
        
        //Create new List to return the scores
        List<Integer> scores = new ArrayList();
        scores.add(aScore);
        scores.add(bScore);

        return scores;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
