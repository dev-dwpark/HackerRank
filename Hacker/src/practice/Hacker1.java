package practice;
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

//https://www.hackerrank.com/challenges/diagonal-difference/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int leftVal = 0, rightVal = 0;

        List<List<Integer>> rowData = arr;

        for(int row=0 ; row<rowData.size() ; row++){
            List<Integer> columnData = rowData.get(row);

           for(int column=0 ; column<columnData.size() ; column++){

               int data = columnData.get(column);

               if(column == row){
                   leftVal = leftVal+data;
               }
               
               if(row == (columnData.size()-1)-column){
                   rightVal = rightVal+data;
               }
           }

        }
        
        int result = Math.abs(leftVal-rightVal);
        
        return result;
    }

}

public class Hacker1 {
    public static void main(String[] args) throws IOException {
    	
    	List<List<Integer>> arr = new ArrayList<>();
    	List<Integer> child = new ArrayList<>();
    	child.add(1);
    	child.add(2);
    	child.add(3);
    	arr.add(child);
    	
    	child = new ArrayList<>();
    	child.add(4);
    	child.add(5);
    	child.add(6);
    	arr.add(child);
    	
    	child = new ArrayList<>();
    	child.add(9);
    	child.add(8);
    	child.add(9);
    	arr.add(child);
    	
    	int result = Result.diagonalDifference(arr);
    	System.out.print("answer->"+result);
    }
}