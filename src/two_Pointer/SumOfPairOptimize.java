package two_Pointer;

/*
 * Find if there exists a pair of numbers in a sorted array that sums to a given target.
 * input :
 * arr = [1,2,3,4,5,6], target = 6
 */

public class SumOfPairOptimize {
	
	public static boolean hasPair(int arr[], int target) {
		
		int left = 0;
		int right = arr.length-1;
		
		while(left<right) {
			int sum = arr[left] + arr[right];
			
			if(sum == target) return true;
			
			else if (sum<target) left++;
			else right --;
		}
		
		
		return false;
	}
	
	public static void main(String[] args) {
		
		int arr[] = { 1,2,3,4};
		int target = 6;
		
		System.out.println(hasPair(arr, target));
	}
	
	

}
