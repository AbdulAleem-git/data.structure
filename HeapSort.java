package data.structure;

public class HeapSort {
	int heapSize = 0;
	public void buildMinheap(int a[]) {
	
		for(int i = a.length/2;i >= 0;i--)
			heapify(a , i, a.length);
	}

	void heapify(int[] a, int i,int n) {
		int left = 2*i+1;
		int right = 2*i+2;
		int min = i; 
		if(i < 0)
			return;
		if(left < n && a[left] < a[min])
			min = left;
		if (right < n && a[right] < a[min])
			min = right;
		if(min == i)
		{
			return;
			
		}
		else {
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
			heapify (a,min,a.length);
		}
	}
		
	
		public static void main(String args[]) {
		HeapSort hs = new HeapSort();
		System.out.println("insert an array of 10");
		java.util.Scanner  sc  = new java.util.Scanner(System.in);
		int a[] = new int [5];
		for(int i = 0 ; i<a.length;i++)
			a[i] = sc.nextInt();
		hs.buildMinheap(a);
		for( int i = 0  ; i<a.length; i++)
			System.out.print(a[i]+" ");
		
		
		System.out.println();
		int n = a.length;
		for( int i = 0 ;  i < n ; i++)
		{
			System.out.print(a[0]+" " );
			a[0] = a[n-i];
			hs.heapify(a,0,n-i-1);
		}
		
		sc.close();
		
	}
	

}
