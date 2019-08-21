package data.structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GFGMaxSubstring {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			//String size[] = br.readLine().split(" ");
		//	int n = Integer.parseInt(size[0]);			
		//	int m = Integer.parseInt(size[1]);
			
			String str1 = br.readLine();
			String str2 = br.readLine();
			
			
			
			int table [][] = new int[str2.length()+1][str1.length()+1];
			
			for( int i = 0 ; i <=str1.length();i++)
				table[0][i] = 0;
			for( int i = 0 ; i <=str2.length();i++)
				table[i][0] = 0;
			int max = 0 ;
			for( int i = 1 ; i<=str2.length() ;i++)
			{
				for(int j = 1 ; j<=str1.length() ;j++)
				{
					if(str2.charAt(i-1) == str1.charAt(j-1))
						table[i][j] = table[i-1][j-1]+1;
					else
						table[i][j] = 0;
				}
			}
			
			for( int i = 1 ; i<=str2.length();i++)
			{
				for( int j= 1 ; j<=str1.length();j++)
				{
					if(max < table[i][j])
						max = table[i][j];
				}
			}
			System.out.println(max);
			
		}
	}

}
