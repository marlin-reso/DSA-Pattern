package slidingWindow;
/*
 * Find the maximum sum of  any contiguous sub array of size k.
 * input : arr = [2,1,5,1,3,2], k = 3;
 * output : 9 -> (5+1+3)
 */

import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class MaxSumNative {
	
	public static int maxSumSubarray(int arr[], int k) {
		
		int maxSum=0;
		
		for(int i=0; i< arr.length-k; i++) {
			
		int currentSum = 0;
		
		for(int j=i; j<i+k; j++) {
			currentSum += arr[j];
		}
		
		maxSum = Math.max(maxSum, currentSum);
			
		}
		
		return maxSum;
	}
	
	public static void main(String[] args) {
		int arr[] =  {2,1,5,1,3,2};
		int k =3;
		System.out.println(maxSumSubarray(arr, k));
		System.out.print(false);
	}
	
	

}
