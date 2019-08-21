package data.structure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.io.*;

public class GFDLeader {
	public static void main(String args[]) throws IOException {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int t = Integer.parseInt( br.readLine());
      for( int i = 0 ; i < t ; t++){
          int n = Integer.parseInt(br.readLine());
          int arr[] = new int[n];
          String str[] = br.readLine().split(" ");
          if(str.length == n)
          {
        	  int j = 0 ;
        	  for(String s:str)
        	  {
        		  arr[j] = Integer.parseInt(s);
        		  j++;
        		  
        	  }
          }
         ArrayList <Integer> leader = new ArrayList<Integer>();
         int p = 0;
         leader.add(p,arr[arr.length-1] );
         for(int j = arr.length-2 ; j>=0;j--)
         {
        	 if(arr[j] >= leader.get(p))
        		 leader.add(++p, arr[j]);
         }
         Collections.reverse(leader);
         
         for(int j = 0 ; j < leader.size();j++)
        	 System.out.print(leader.get(j)+" ");
      }
	}
}
