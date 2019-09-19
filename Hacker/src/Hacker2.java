//https://www.hackerrank.com/challenges/plus-minus/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Hacker2 {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    	int plusCnt = 0;
    	int zeroCnt = 0;
    	int minusCnt = 0;
    	
    	for(int val : arr) {
    		if(val>0) {
    			plusCnt++;
    		}else if(val<0) {
    			minusCnt++;
    		}else {
    			zeroCnt++;
    		}
    	}
    	
    	System.out.println((double)plusCnt/(double)arr.length);
    	System.out.println((double)minusCnt/(double)arr.length);
    	System.out.println((double)zeroCnt/(double)arr.length);
    	
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,1,0,-1,-1};
        plusMinus(arr);
        
    }
}
