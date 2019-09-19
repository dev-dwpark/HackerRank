package practice;
//https://www.hackerrank.com/challenges/mini-max-sum/problem?h_r=next-challenge&h_v=zen
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Hacker4 {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	Arrays.sort(arr);
    	long max = 0;
    	long min = 0;
    	for(int i : arr) {
    		max = max+i;
    		min = min+i;
    	}
    	
    	max = max-arr[0];
    	min = min-arr[arr.length-1];
    	
    	System.out.print(min+" "+max);
    }

    public static void main(String[] args) {
        int[] arr = new int[] {256741038,623958417,467905213,714532089,938071625};
        miniMaxSum(arr);
    }
}
