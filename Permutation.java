package data.structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Permutation {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			String para = br.readLine().toUpperCase();
			Permutation p  = new Permutation();
			int n = para.length()-1;
			p.permutation(para,0,n);
				
			}

		}


	public void permutation(String para, int l, int r) {
		
		if(l == r)
			System.out.print(para+" ");
		else {
			for( int i = l ; i<=r;i++)
			{
				para = swap(para,l,i);
				permutation(para,l+1,r);
				para = swap(para,l,i);
				
			}
		}
		
	}


	private String swap(String para, int l, int i) {
		char arr[] = para.toCharArray();
		char temp = arr[l];
		arr[l] = arr[i];
		arr[i] =temp;
		return String.valueOf(arr);
	}
}

