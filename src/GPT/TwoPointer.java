package GPT;

import java.util.Arrays;

public class TwoPointer {
	
	public static void main(String[] args) {
		TwoPointer tp = new TwoPointer();
		int arr[]= {1,4,8,5,0,5,0,8};
		int arr1[] = new int[arr.length];
		
		//tp.reverseArray(arr);
		//boolean result = tp.pairWithGivenSum(arr, 8);
		//System.out.println(result);
		int value = tp.rmDuplicateInOnePlace(arr);
		for(int i=0; i<value;i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	//Remove duplicates in-place
	//“I am handling memory and indexes myself.”
	public int rmDuplicateInOnePlace(int arr[]) {
		int slow = 0;
		Arrays.sort(arr);
		for(int fast=1; fast<arr.length; fast++) {
			if(arr[slow] != arr[fast]) {
				slow++;
				arr[slow]= arr[fast];
			}
		}
		return slow+1;
	}
	//Pair with given sum in sorted array
	public boolean pairWithGivenSum(int arr[], int k) {
		int left = 0;
		int right = arr.length-1;
		while(left<right) {
			int sum = arr[left] + arr[right];
			if(k>sum) {
				left++;
			}else if(k<sum) {
				right--;
				
			}else if(k==sum) return true;
		}
		return false;
	}
	//Reverse Array using two pointer
	public int[] reverseArray(int arr[]) {
		int left = 0;
		int right = arr.length-1;
		while(left<right) {
			int temp = arr[left];
			arr[left]= arr[right];
			arr[right]= temp;
			left++;
			right--;
		}
		
		for(int num : arr) {
			System.out.println(num);
		}
		
		return null;
	}

}
