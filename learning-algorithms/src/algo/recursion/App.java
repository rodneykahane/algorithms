package algo.recursion;


public class App {

	public static void main(String[] args) {
		
		//int[] a = {5,4,2,8,3,9,1,7};
		int[] a = {1,2,3,4,5,6,7,8,9};
		//RecursiveLinearSearch search = new RecursiveLinearSearch();
		RecursiveBinarySearch search = new RecursiveBinarySearch();
		
		//reduceByOne(10);
		//System.out.println(search.rLinearSearch(a,0,1));
		System.out.println(search.rBinarySearch(a, 0, a.length-1,9 ));
	}
	
	public static void reduceByOne (int n) {
		if(n>=0) {
			reduceByOne(n-1);
		}
		System.out.println("completed with call "+n);
	}

}
