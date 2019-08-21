package data.structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GFGEquilberium {
	public static int sum( int arr[]) {
		int sum = 0  ;
		for( int k = 0 ; k < arr.length ; k++)
			sum += arr[k];
		return sum;
		
	}
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			int n = Integer.parseInt(br.readLine());
			String str[] = br.readLine().split(" ");
			int i = 0 ;
			int arr [] = new int[n];
			for(String s: str)
			{
				arr[i++] = Integer.parseInt(s);
			}
			if(arr.length == n)
			{
				if(n==1)System.out.print("1");
				int temp = arr[0];
				int s = sum(arr);
				for( int j = 1; j<arr.length-1;j++) {
					int left = temp;
					temp = temp + arr[j];
					int right = s - temp;
					if(left == right)
						System.out.println(arr[j]);
				}
			}
		}
		
		
	}

}
