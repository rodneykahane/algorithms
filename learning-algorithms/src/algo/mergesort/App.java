package algo.mergesort;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
		//int[] inputArray = {9,7,3,1,6,3,2,6,8,9,2,3,0};
		
		int[] inputArray = {12,1,11,2,10,3,9,4,8,5,7,6};
		MergeSort sorter = new MergeSort();
		
		//System.out.println(sorter.sort(inputArray));
		System.out.println(Arrays.toString(sorter.sort(inputArray)));

		
	}//end main

}//end class
