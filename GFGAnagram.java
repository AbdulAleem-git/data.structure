package data.structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;


public class GFGAnagram {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
		String str = br.readLine().toLowerCase();
		String s[] = str.split(" ");
		if(s[0].length() == s[1].length()) {
			char charArray1[] = s[0].toCharArray();
			char charArray2[] = s[1].toCharArray();
			Set<Character> set1 = new LinkedHashSet<Character>();			
			for(char c : charArray1)
			{
				set1.add(c);
			}
			int i= 0;
			for(  ; i < charArray2.length; i++)
			{
				if(set1.contains(charArray2[i]))
						continue;
				else
					break;
			}
			if(i == charArray2.length)
				System.out.println("Yes");
			else
				System.out.println("NO");

		}
		else
			System.out.println("NO");
		
		
		
	}

}
}
