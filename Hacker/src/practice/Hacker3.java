package practice;
//https://www.hackerrank.com/challenges/staircase/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Hacker3 {

    // Complete the staircase function below.
    static void staircase(int n) {
    	String fullStair = "";
    	for(int i=1; i<=n; i++) {
    		
    		String space = "";
    		for(int ii=0; ii<n-i; ii++) {
    			space = space+" ";
    		}
    		
    		String stair = "";
    		for(int ii=0; ii<i; ii++) {
    			stair = stair+"#";
    		}
    		
    		fullStair = fullStair+(space+stair);
    		if(i<n) {
    			fullStair = fullStair+"\n";
			}
    	}
    	System.out.println(fullStair);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	int i = 4;
    	staircase(i);
    }
}