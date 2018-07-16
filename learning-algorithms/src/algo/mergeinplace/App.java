package algo.mergeinplace;

public class App {

	public static void main(String[] args) {
		
		MergeInPlace merge = new MergeInPlace();
		int[] input = {4,7,9,2,1,8,6,3,0};
		int mid = input.length/2;
		int end = input.length-1;
		
		merge.mergeInPlace(input,0,mid,end);
		

	}

}
