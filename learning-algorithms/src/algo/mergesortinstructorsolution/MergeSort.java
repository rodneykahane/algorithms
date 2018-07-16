package algo.mergesortinstructorsolution;

public class MergeSort {

	public static void sort(int[] a) {

		sort(a,0, a.length-1);	


	}//end sort	

	public static void sort(int[] a, int start, int end) {
		if(end <= start) {
			return;
		}

		int mid = (start+end)/2;				
		sort(a,start,mid);				
		sort(a,mid+1,end);
		merge(a,start,mid,end);
	}//end sort

	public static void merge(int a[], int start, int mid, int end) {
		int tempArray[] = new int[end - start +1];

		int leftSlot = start;  //index of 1st slot on the left array
		int rightSlot = mid+1;  //index of the 1st slot on the right array
		int k = 0;

		while(leftSlot <= mid && rightSlot <= end) {
			if(a[leftSlot]< a[rightSlot]) {
				tempArray[k] = a[leftSlot];
				leftSlot++;				
			} else {
				tempArray[k] = a[rightSlot];
				rightSlot++;
			}
			k++;
		}//end while

		/*when it gets to here, that means the above loop has completed.
		so both the right and left side of the sub-array can be considered sort
		 */

		if(leftSlot<=mid) { //consider the right side done being sorted. left must be sorted already
			while(leftSlot <= mid) {
				tempArray[k] = a[leftSlot];
				leftSlot++;
				k++;
			}
		} else if (rightSlot <= end) {
			while(rightSlot <= end) {
				tempArray[k] = a[rightSlot];
				rightSlot++;
				k++;		
			}
		}

		//copy over the temp array into the appropriate slots of the input array
		
			for(int i=0;i<tempArray.length;i++) {			
				a[start+i] = tempArray[i];
				System.out.print(a[i]+",");
			}			

	}//end merge

}