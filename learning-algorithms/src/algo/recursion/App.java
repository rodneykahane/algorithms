package algo.recursion;


public class App {

	public static void main(String[] args) {
		
		//int[] a = {5,4,2,8,3,9,1,7};
		//int[] a = {1,2,3,4,5,6,7,8,9};
		int [] a = {25,47,3,19,8,18};
		//RecursiveLinearSearch search = new RecursiveLinearSearch();
		//RecursiveBinarySearch search = new RecursiveBinarySearch();
		
		//reduceByOne(10);
		//System.out.println(search.rLinearSearch(a,0,1));
		//System.out.println(search.rBinarySearch(a, 0, a.length-1,9 ));
		
		//sort(a);
		selectSort(a);
	}//end main
	
	public static void reduceByOne (int n) {
		if(n>=0) {
			reduceByOne(n-1);
		}
		System.out.println("completed with call "+n);
	}//end reduceByOne

	public static void sort(int[] a) {
		int tmp;		
		
		for(int j=0;j<a.length;j++) {
			
			for(int i=1;i<a.length;i++) {
				if(a[i]<a[i-1]) {					
					tmp=a[i];
					a[i] = a[i-1];
					a[i-1]=tmp;
				}			
			}			
		}		
	}//end sort
	
	public static void selectSort(int[] a) {
		int smallest=99;
		int tmp=-1;
		int index=0;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]<smallest) {
				smallest = a[i];
				System.out.println("smallest is: "+smallest);
				index = i;	
				System.out.println("index is: "+index);
				tmp = a[0];
			}
			
			a[0]=smallest;
			a[index]=tmp;
			
		}
		
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+", ");
		}
		
	}
	
	
	
	
}//end class
