package algo.mergeinplace;

public class MergeInPlace {
	//email an explanation of how this works to imtiaz@eliminatecodefear.com for 75% off discount on courses


	private static int tempArray[];  //an array used for merging
	//to use the mergeInPlace() method, you'll need to initialize tempArray as
	//shown on the next line inside of the wrapper sort() method
	//tempArray = new int [inputArray.length];

	public static void mergeInPlace(int inputArray[], int start, int mid, int end){
		int i = start;
		int j = mid+1;
		tempArray = new int [inputArray.length];

		for (int k=0;k<=end;k++){
			tempArray[k]= inputArray[k];		 
		}

		System.out.print("starting values for ");
		printArray(inputArray);
		for(int k = start; k<=end; k++){

			System.out.print("option 1 - is i ("+i+") greater than mid ("+mid+")? ");
			System.out.println(i>mid);
			System.out.print("option 2 - is j ("+j+") greater than end ("+end+")? ");
			System.out.println(j>end);
			if(j<tempArray.length-1) {
				System.out.print("option 3 - is tempArray[j] ("+tempArray[j]+") less than tempArray[i] ("+tempArray[i]+")? ");
				System.out.println(tempArray[j] < tempArray[i]);
			} 			
			System.out.println("option 4 - else inputArray[k] ("+inputArray[k]+") will be set to inputArray[i] ("+inputArray[i]+")");			

			if(i> mid){
				inputArray[k] = tempArray[j];
				
				System.out.println("(option 1) setting inputArray[k] to tempArray[j] ("+tempArray[j]+")");
				printArray(inputArray);
				
				j++;
				
			} else if(j>end){
				inputArray[k] = tempArray[i];
				
				System.out.println("  (option 2) setting inputArray[k] to tempArray[i] ("+tempArray[i]+")");
				System.out.print("  ");
				printArray(inputArray);
				
				i++;
				
			} else if(tempArray[j] < tempArray[i]){
				inputArray[k] = tempArray [j];
				
				System.out.println("  (option 3) setting inputArray[k] to tempArray[j] ("+tempArray[j]+")");
				System.out.print("  ");
				printArray(inputArray);
				
				j++;
				
			} else {
				inputArray[k]=tempArray[i];
				
				System.out.println("  (option 4) setting inputArray[k] to tempArray[i] ("+tempArray[i]+")");
				System.out.print("  ");
				printArray(inputArray);
				
				i++;
				
			}//leave elements in the same place

		} 




	}//end mergeInPlace
	public static void printArray(int[] a) {
		System.out.print("input array: ");
		for (int x=0;x<a.length;x++) {

			System.out.print(a[x]+","); 
		}
		System.out.println("");
		System.out.println("");

	}
}//end class
