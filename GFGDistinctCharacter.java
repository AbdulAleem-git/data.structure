package data.structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GFGDistinctCharacter {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			String str1 = br.readLine();
			String array[] = new String[str1.length()];
			for( int i = 0 ; i<array.length ;i++)
				array[i] ="";
			int  k = 0 ; 
			for( int i = 0; i<str1.length();i++)
			{
				if(!isContains(array[k],str1.charAt(i)))
				{
					array[k] += str1.charAt(i);
				}
				else
				{
					i=i-1;
					array[++k] +=str1.charAt(i);
				}				
				
			}
			int max = 0 ; 
			for( int i = 0 ;i<array.length ;i++)
			{
				if(max < array[i].length())
					max = array[i].length();
			}
			System.out.println(max);
		}
	}

	private static boolean isContains(String str,char c) {
		if(str.length() == 0)
			return false;
			
		for(int i = 0 ; i < str.length() ; i++)
		{
			if(str.charAt(i) == c)
				return true;
			
		}
		return false;
		
	}

}
