//Sparsearrays
/*
Sparse Arrays
There is a collection of input strings and a collection of query strings. For each query string, determine
how many times it occurs in the list of input strings.
For example, given input and , we find instances of ,
of and of . For each query, we add an element to our return array, .
Function Description
Complete the function matchingStrings in the editor below. The function must return an array of integers
representing the frequency of occurrence of each query string in strings.
matchingStrings has the following parameters:
strings - an array of strings to search
queries - an array of query strings
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
       
        int stringSize = in.nextInt();
        ArrayList <String> strList = new ArrayList<String>();
        for(int i = 0 ; i< stringSize ; ++i)
            strList.add(in.next());
        
        int querySize = in.nextInt();
        ArrayList <String> queryList = new ArrayList<String>();
        for(int i = 0 ; i< querySize ; ++i)
            queryList.add(in.next());
        
        
        for(int i = 0 ; i <querySize ; ++i)
        {
            int count=0;
            for(int j=0 ; j<stringSize ; ++j)
                {
                    if(queryList.get(i).equalsIgnoreCase(strList.get(j)))
                        count++;
                }
            
            System.out.println(count);
        }
    }
}
