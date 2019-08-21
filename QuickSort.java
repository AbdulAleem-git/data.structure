package data.structure;

public class QuickSort {
	public void quickSort(int arr[],int p,int r) {
		
		if(p<r) {
			int q = partition(arr, p ,r);
			quickSort(arr,p,q-1);
			quickSort(arr,q+1,r);
			
		}		
		
	}
	public int partition(int arr[], int p, int r) {
		int pivot = arr[r];
		int i = p-1;
		int j;
		 
    	for(j = p ; j<r ; j++ )
		{
			if(pivot >= arr[j])
			{
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[r];
		arr[r] = temp;
		return i+1;	
	}
	
	
	public static void main(String args[]) {
		QuickSort qs = new QuickSort();
		int a [] = {7,9,8,7,6,5,4,3,2,1,0};
		int b [] = {90,90,80,70,60,50,40,30,20,10,00};
		qs.quickSort(a,0,a.length-1);
		qs.quickSort(b,0,b.length-1);
		for( int i = 0 ; i< a.length; i++)
			System.out.print(a[i]+" ");
		
		System.out.println();
		for( int i = 0 ; i< b.length; i++)
			System.out.print(b[i]+" ");
	}

}
