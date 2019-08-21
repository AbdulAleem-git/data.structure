package data.structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringMaching {
	int count = 0 ; 
	static StringMaching sm = new StringMaching();
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			String str1 = br.readLine();
			String str2 = br.readLine();
			
			if(str1.equals(str2))
				System.out.print("no move");
			char arr1[] = str1.toCharArray();
			char arr2[] = str2.toCharArray();
			moveCount(arr1,arr2);
			System.out.println(sm.count);
				
		}
	}
	public static void moveCount(char arr1[],char arr2[]) {
		int pos = 0;
		for(int i = 0 ; i < arr1.length ; i++ )
		{
			pos = 0;
			if(arr1[i] ==  arr2[i])
			{			
				continue;
			}
			for(int k = i ; k<arr1.length;k++)
			{
				if(arr1[i] ==  arr2[i])
				{			
					break;
				}
				if((arr1[i] == arr2 [k])&&(arr2[i] == arr2[k]))
				{
					swap(arr2,i,k);
					
				}
				
			}
			if(arr1[i] ==  arr2[i])
			{			
				continue;
			}
			
			else {
				for( int j = i ; j<arr2.length;j++)
				{
						
					if(arr1[i] == arr2[j])
					{
						if(arr2[i] == arr1[j]) {
							pos = j;
							break;
						}
						else
						{
							pos = j ; 
							continue;
						}
					}
					
					
				}
				swap(arr2,i,pos);				
			}
			
		}
		
	}
	public static void swap(char[] arr2, int i, int pos) {
		sm.count++;
		char temp = arr2[i];
		arr2[i] = arr2[pos];
		arr2[pos] = temp;
		
		
	}
}
