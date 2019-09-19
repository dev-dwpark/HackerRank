package practice;
//https://www.hackerrank.com/challenges/birthday-cake-candles/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Hacker5 {

    // Complete the miniMaxSum function below.
    static void birthdayCakeCandles(int[] arr) {
    	Integer[] arr_ = Arrays.stream(arr).boxed().toArray(Integer[]::new);
    	arr = Arrays.stream(arr_).mapToInt(Integer::intValue).toArray(); 
    	
    	int origin = 0;
    	int cnt = 0;
    	for(int i : arr) {
    		if(origin>0 && origin != i) {
    			return;
    		}
    		origin = i;
    		
    		cnt++;
    	}
    	
    	System.out.print(cnt);
    	
    }

    public static void main(String[] args) {
        int[] arr = new int[] {4,4,4,1,3};
        birthdayCakeCandles(arr);
    }
}
