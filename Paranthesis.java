package data.structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Paranthesis {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			String para = br.readLine();
			Stack<Character> stck = new Stack<Character>();
			int i;
			for( i = 0 ; i< para.length();i++) {
				if( para.charAt(i) == '('||para.charAt(i) == '['||para.charAt(i) == '{')
					stck.push(para.charAt(i));
				if( para.charAt(i) == ')'||para.charAt(i) == ']'||para.charAt(i) == '}')
				{
					if(stck.empty())
						break;
					char c = stck.pop();
					if(c == '(' && para.charAt(i)==')')
						continue;
					else if(c == '[' && para.charAt(i)==']')
						continue;
					else if(c == '{' && para.charAt(i)=='}')
						continue;
					else
						break;
				}
				
	
		
			}
		
			if(stck.isEmpty() && i>=para.length())
				System.out.println("balanced");
			else
				System.out.println("not balanced");
			
			
		}
}
}
