package algo.recursion;

public class RecursiveBinarySearch {

	
	public int rBinarySearch(int[] a, int p, int r, int x) {
		int q = (int) Math.floor(a.length/2)-1;
		System.out.println("q is: "+q);
		System.out.println("the value of position q in the array is: "+a[q]);
		
		if (p>r) {
			return -1;
		} else if(a[q]==x) {
			return q;
		} else if (a[q]>x) {
			r=q-1;
		} else if(a[q]<x) {
			p = q+1;
		} 		
			return 0;
		//return rBinarySearch(a,p,r,x);
		
	}//end rBinarySearch
}//end class
