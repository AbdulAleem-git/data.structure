package data.structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


public class DeleteDuplicate {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			Map<Character,Character> m = new LinkedHashMap<Character,Character>();
			char str[] = br.readLine().toCharArray() ;
			for( int i = 0 ; i<str.length; i++)
				m.put(str[i], str[i]);
			for(Entry<Character,Character> e :m.entrySet()) {
				System.out.print(e.getKey());
			}
			
			
		}
		
	}

}
