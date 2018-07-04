package algo.linearsearch;

public class App {

	public static void main(String[] args) {
		
		int[] dataSet = {1,3,2,4,5,9,7,22,};
		int x = 25;		
		
		LinearSearch search = new LinearSearch();		
		
		System.out.println("the index is "+search.searchArray(dataSet,x));		

	}

}
