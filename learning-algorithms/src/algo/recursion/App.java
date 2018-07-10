package algo.recursion;


public class App {

	public static void main(String[] args) {
		
		int[] a = {5,4,2,8,3,9,1,7};
		RecursiveLinearSearch search = new RecursiveLinearSearch();
		
		//reduceByOne(10);
		System.out.println(search.rLinearSearch(a,0,1));
	}
	
	public static void reduceByOne (int n) {
		if(n>=0) {
			reduceByOne(n-1);
		}
		System.out.println("completed with call "+n);
	}

}
