package data.structure;

public class MergeSort {
	void merge(int a[] , int p , int m , int r) {
		int n1 = m - p + 1 ; 
		int n2 = r - m;
		int left[]  = new int[n1];
		int right[] = new int[n2];
		for( int i = 0 ; i < n1 ; i++)
			left[i] = a[p+i];
		for( int j = 0 ; j < n2 ; j++)
			right[j] = a[j+1+m];
		int i=0,j=0,k=p;
		while(i < n1 && j<n2)
		{
			if(left[i] < right[j])
			{
				a[k] = left[i];
				i++;
				k++;
			}
			else
			{
				a[k] = right[j];
				j++;
				k++;
				
			}
		}
		while(i<n1)
		{
			a[k] = left[i];
			i++;
			k++;
			
		}
		while(j<n2)
		{
			a[k] = right[j];
			j++;
			k++;
			
		}
		
		
		
		
	}
	void mergeSort(int a[] ,int p , int r) 
	{
		int mid = (p+r)/2;
		if(p<r)
		{
			mergeSort(a,p,mid);
			mergeSort(a,mid+1,r);
			merge(a,p,mid,r);
		}
	}
	public static void main(String str[]) {
		int a [] = {9,8,7,6,5,4,3,2,1,0};
		int b [] = {90,90,80,70,60,50,40,30,20,10,00};
		MergeSort ms = new MergeSort();
		ms.mergeSort(a,0,a.length-1);
		ms.mergeSort(b,0,b.length-1);
		for( int i = 0 ; i< a.length; i++)
			System.out.print(a[i]+" ");
		
		System.out.println();
		for( int i = 0 ; i< b.length; i++)
			System.out.print(b[i]+" ");
		
		
	}

}
