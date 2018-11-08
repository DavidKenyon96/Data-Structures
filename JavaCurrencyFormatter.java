//Reference: https://www.hackerrank.com/challenges/java-currency-formatter/
//"Given a double-precision number, `payment`, denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to 
//convert `payment` into the US, Indian, Chinese, and French currency formats.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaCurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        String us = NumberFormat.getCurrencyInstance(new Locale("en", "US"))
        .format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"))
        .format(payment);
        String china = NumberFormat.getCurrencyInstance(new Locale("zh", "CN"))
        .format(payment);
        String france = NumberFormat.getCurrencyInstance(new Locale("fr", "FR"))
        .format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}