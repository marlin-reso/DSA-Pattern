package two_Pointer;

/*
 * Find if there exists a pair of numbers in a sorted array that sums to a given target.
 * input :
 * arr = [1,2,3,4,5,6], target = 6
 */

public class SumOfPairNative {
	
	public static boolean hasPair(int[] arr, int target) {
		
		for(int i=0; i< arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				
				if(arr[i] + arr[j]== target) return true;
			}
		}
		return false;
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		int arr[] = {1,2,3,4};
		int target = 6;
		
		System.out.println(hasPair(arr,target));
	}
	

}
