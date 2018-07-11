package algo.selectionsort;

public class App {

	public static void main(String[] args) {
		int[] myArray = selectionSort(new int[] {9,8,3,13,87,12,99});
		
		for(int i=0;i<myArray.length;i++) {
			System.out.print(myArray[i]);
		}

	}//end main
	
//for i=0 to A.length-1
	//set minimum to i
	//for j=i+1 to A.length
	   //if A[j] < A[minimum]
			//set minimum to j
	//swap A[i] with A[minimum]
	public static int[] selectionSort(int[] a) {
		int[] sortedArray;
		int minimum;
		
		for(int i=0;i<a.length;i++) {
			minimum=a[i];
			
			for(int j=0;j<a.length;j++) {
				if (a[j] < minimum) {
					minimum = a[j];
				}
			}
		}
		
		
		return a;
	}//end selectionSort

}//end class
