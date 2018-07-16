package algo.mergesortinstructorsolution;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		int[] inputArray = {9,7,3,1,6,3,2,6,8,9,2,3,0};
		
		//int[] inputArray = {12,1,11,2,10,3,9,4,8,5,7,6};
		MergeSort sorter = new MergeSort();
		
		//System.out.println(sorter.sort(inputArray));
		//System.out.println(Arrays.toString(sorter.sort(inputArray)));
		sorter.sort(inputArray);
		
		for(int i=0;i<inputArray.length;i++) {
			//System.out.print(inputArray[i]+",");;
		}		
	}//end main

}//end class
