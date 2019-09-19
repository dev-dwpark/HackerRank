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

	// Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        Integer[] arr_ = Arrays.stream(ar).boxed().toArray(Integer[]::new);
        Arrays.sort(arr_, Collections.reverseOrder());
        ar = Arrays.stream(arr_).mapToInt(Integer::intValue).toArray(); 
        
        int origin = 0;
        int cnt = 0;
        for(int i : ar) {
        	System.out.println(i);
            if(origin>0 && origin != i) {
                break;
            }
            origin = i;
            
            cnt++;
        }
        
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {3,2,1,3};
        int cnt = birthdayCakeCandles(arr);
        System.out.println(cnt);
    }
}
