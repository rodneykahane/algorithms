package algo.binarysearch;

public class BinarySearch {

	public static void main(String[] args) {
		int[] dataSet = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int query = 13;
		
		System.out.println(binarySearch(query,dataSet));

	}

	public static int binarySearch(int x, int[] a) {
		int p=0,r=a.length-1; //p is lower bound, r is upper bound
		int q;

		
		while(p<=r) {
			q = (int) Math.floor((p+r)/2);
			if(a[q]==x) { //did we find the value?
				return q;
			}
			if(a[q]>x) { //the upper bound is too high, reduce it
				r=q-1;
			} else {
				p=q+1; //the lower bound is too low, raise it
			}
		}
//



		return -1;

	}

}
