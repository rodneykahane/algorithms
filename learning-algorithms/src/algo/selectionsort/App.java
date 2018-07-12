package algo.selectionsort;

public class App {

	public static void main(String[] args) {
		int[] myArray = selectionSort(new int[] {9,8,3,13,87,12,99});
		
		for(int i=0;i<myArray.length;i++) {
			System.out.print(myArray[i]+", ");
		}

	}//end main

	public static int[] selectionSort(int[] a) {				
			
		for(int i=0;i<a.length-1;i++) {
			int minimum = i;
			
			for(int j=i+1;j<a.length;j++) {
				if (a[j] < a[minimum]) {
					minimum = j;
															
				}//end if
			}//end for
			
			//swapping old smallest for new smallest
			int tmp = a[i];			
			a[i] = a[minimum];
			a[minimum] = tmp;			
			
		}//end for		
		
		return a;
	}//end selectionSort

}//end class
