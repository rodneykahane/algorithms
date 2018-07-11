package algo.selectionsort;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		int[] myArray = selectionSort(new int[] {9,8,3,13,87,12,99});
		
		for(int i=0;i<myArray.length;i++) {
			System.out.print(myArray[i]+", ");
		}

	}//end main
	
//for i=0 to A.length-1
	//set minimum to i
	//for j=i+1 to A.length
	   //if A[j] < A[minimum]
			//set minimum to j
	//swap A[i] with A[minimum]
	public static int[] selectionSort(int[] a) {				
		
		for(int i=0;i<a.length-1;i++) {
			int minimum = i;
			
			for(int j=0;j<a.length;j++) {
				if (a[j] < a[minimum]) {
					minimum = j;
					//System.out.println("minimum is: "+ minimum);	
					
					
				}
				
				
			}
			int tmp = a[i];				
			a[i] = a[minimum];
			a[minimum] = tmp;
			System.out.println(Arrays.toString(a));
			
		}
		
		
		return a;
	}//end selectionSort

}//end class
