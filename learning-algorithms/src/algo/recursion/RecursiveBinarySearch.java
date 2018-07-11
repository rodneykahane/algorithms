package algo.recursion;

public class RecursiveBinarySearch {

	
	public int rBinarySearch(int[] a, int p, int r, int x) {
		//int q = (int) Math.floor(a.length/2)-1;
		//System.out.println("q is: "+q);
		//System.out.println("the value of position q in the array is: "+a[q]);
		
		if (p>r) {
			return -1;
		} else if(a[(p+r)/2]==x) {
			return ((p+r)/2);
		} else if (a[(p+r)/2]>x) {
			r=((p+r)/2)-1;
		} else if(a[(p+r)/2]<x) {
			p = ((p+r)/2)+1;
		} 		
		//	return 0;
		return rBinarySearch(a,p,r,x);
		
	}//end rBinarySearch
}//end class
