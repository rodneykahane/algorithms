package algo.quicksort;



public class App {

	public static void main(String[] args) {
		int[] inputArray = {6,8,7,2,4,3,5};
		Quicksort sort = new Quicksort();
		
		sort.quickSort(inputArray, 0, inputArray.length-1);		
		
	}

}
