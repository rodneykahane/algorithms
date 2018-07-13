package algo.mergesort;

import java.util.Arrays;

public class MergeSort {
	
	public static void sort (int a[]) {
			sort(a,0, a.length-1);
		
	}//end sort	
	
	public static void sort(int[] a, int start, int end) {
				
				if(end<=start) {
					return;
				}
				
				int mid = (start+end)/2;				
				sort(a,start,mid);				
				sort(a,mid+1,end);
				merge(a,start,mid,end);		
				
		}//end sort
	
	public static void merge(int a[], int start, int mid, int end) {
		
	}//end merge


}//end class
