package data.structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ReverseSentences {

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			String para = br.readLine();
			String [] sentence = para.split("\\.");
			Stack<String> stck = new Stack<String>();
			int i;
			for( i = 0 ; i< sentence.length;i++) {
						stck.push(sentence[i]);
							
			}
			String reverse = "";
			
			while(!stck.isEmpty())
				
			{	
				String str = stck.pop();
			
				reverse = reverse+str+".";
				
				
			}
			reverse = reverse.substring(0, reverse.length()-1);
			
			System.out.print(reverse);
		
						
			
		}
}
}
