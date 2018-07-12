package algo.insertionsort;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		int[] a = {25,47,3,19,8,18};
		
		System.out.println(Arrays.toString(insertionSort(a)));

	}//end main	
	
	public static int[] insertionSort(int[] a) {
		for(int i=1;i<a.length;i++) {
			int element = a[i];
			int j = i-1;
			while(j>=0 && a[j]> element) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1] = element;
		}
		
		return a;
	}
}//end class
