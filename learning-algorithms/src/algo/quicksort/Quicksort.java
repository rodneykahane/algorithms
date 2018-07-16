package algo.quicksort;

import java.util.Arrays;

public class Quicksort {
	
	
	public static void quickSort(int[] a, int p, int r) {
		if(p<r) {
			int q=partition(a,p,r);
			quickSort(a,p,q-1);//left side
			quickSort(a,q+1,r);//right side
		}
		System.out.println(Arrays.toString(a));
	}
	
	public static int partition(int[] a, int p, int r) {
		int x = a[r];  //using last element as initial pivot
		int i = p-1;
		
		for(int j=p;j<=r-1;j++) {
			if(a[j]<=x) {
				i++;
				//swap a[i] with a[j]
				int tmp = a[i];
				a[i]=a[j];
				a[j]=tmp;
			}
		}
		//swap a[i+1] with a[r]
		int tmpb = a[i+1];
		a[i+1] = a[r];
		a[r]=tmpb;	
		
		return i+1;
	}
	
	
	
}
