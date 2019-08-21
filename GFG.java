package data.structure;

import java.util.*;
import java.util.Map.Entry;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt( br.readLine());
        for( int i = 0 ; i < t ; t++){
            HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
            int n = Integer.parseInt(br.readLine());
            String str[] = br.readLine().split(" ");
            for(String s : str)
            {
               int key = Integer.parseInt(s);
               if(hm.containsKey(key) == true)
               {
                    hm.replace(key, hm.get(key), hm.get(key)+1);
               }
               else
                    hm.put(key, 1);
            }
            int max = 0;
            int value = 0;
          for(Entry<Integer,Integer> e : hm.entrySet())
          {
        	     	  
        	  if(e.getValue()>max) {
        		  max = e.getValue();
        		  value = e.getKey();
        	  }
          }
          if(max > n/2)
          {
        	  System.out.println(value);
          }
          else
          {
              System.out.println("-1");
          }
        	  
            
        }
        
	 }
}