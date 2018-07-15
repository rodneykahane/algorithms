package algo.mergesort;

import java.util.Arrays;

public class MergeSort {
	
	public static int[] sort (int a[]) {
			int[] b = sort(a,0, a.length-1);
			
			return b;
		
	}//end sort	
	
	public static int[] sort(int[] a, int start, int end) {
				
				if(end<=start) {
					int[] x = {-1};
					return  x;
				}
				
				int mid = (start+end)/2;				
				sort(a,start,mid);				
				sort(a,mid+1,end);
				int[] b = merge(a,start,mid,end);
				
				return b;
				
		}//end sort
	
	public static int[] merge(int a[], int start, int mid, int end) {
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i-1]>a[i]) {
				int tmp;
				tmp = a[i];
				a[i]=a[i-1];
				a[i-1]=tmp;				
			}
		}		
		//System.out.println(Arrays.toString(a));
		return a;
		
	}//end merge


}//end class
