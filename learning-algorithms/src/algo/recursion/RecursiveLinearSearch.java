package algo.recursion;

public class RecursiveLinearSearch {
	
	public int rLinearSearch(int[] a, int i, int x){
		int n=a.length-1;
		
		if (i > n) {
			return -1;
		} else if(a[i]==x){
			return i;			
		}		
		return rLinearSearch(a,i+1,x);
	}//end rLinearSearch
}//end class  