package algo.linearsearch;

public class LinearSearch {

	public int searchArray(int[] a, int x) {		
		int answer=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==x) {
				answer = i;
				return answer;
			}
		}
		return answer;
	}

}//end class
