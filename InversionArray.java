package data.structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InversionArray {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			int size = Integer.parseInt(br.readLine());
			String str[] = br.readLine().split(" ");
			int arr [] = new int[size];
			int  k = 0 ;
			for(String s: str) {
				arr[k++] = Integer.parseInt(s);
				
			}
			
			
			int inversionCount = 0 ;
			for(int i11 = 0 ; i11<arr.length;i11++)
			{
				for( int j = i11+1 ; j<arr.length;j++)
				{
					if(arr[i11] > arr[j])
						inversionCount++;
				}
			}
			System.out.println(inversionCount);
		}
	}

}
