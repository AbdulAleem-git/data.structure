package data.structure;

public class URLify {
	public static void main(String args []) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		char charArray[] = sc.nextLine().toCharArray();
		System.out.println(charArray.length);
		int j = charArray.length-1;
		int trueLength = charArray.length;
		while(charArray[j] == ' ') {
			charArray[j--] ='\0';
			trueLength--;
		}
	
		
		System.out.println(trueLength);
	
		int spaceCount =0;
		for( int i = 0 ; i<charArray.length;i++)
		{
			if(charArray[i] == ' ')
				spaceCount++;
		}
		int index = trueLength + 2*spaceCount;
		char charArray2[] = new char[index];
		for( int i = trueLength-1 ; i>=0 ; i--)
		{
			if(charArray[i] == ' ')
			{
				charArray2[--index] = '0';
				charArray2[--index] = '2';
				charArray2[--index] = '%';
						
				
			}
			else
				charArray2[--index] = charArray[i];
		}
		for(char c : charArray2)
			System.out.print(c);
		sc.close();
	}
	

}