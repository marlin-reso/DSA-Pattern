package GPT;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class TwoPointerAndSlidingWindow {

	public static void main(String[] args) {
		TwoPointerAndSlidingWindow tp = new TwoPointerAndSlidingWindow();
		Set<Integer>set = new LinkedHashSet<>();
		int arr[] = {1,3,5,7,1,4,11,13,24,0};
		int arr1[] = {1,2,3,4,6,7};
		int arr2[] = { 1,4,-2,-8,9,7,-6,-4,9,7};
		int arr3[] = {0,2,0,4,8,9,0,5};
	//	tp.reverseArray(arr);
	//	boolean value = tp.findPairOfNumber(arr, 20);
	//	System.out.println(value);
	//	set = tp.rmDuplicate(arr);
	//	System.out.println(set);
	//	tp.moveNegative(arr2);
	//	tp.moveZero(arr3);
		int value =tp.findLongestSubString("abcdaef");
		System.out.println(value);
		
		

	}
	//Longest substring without repeating characters
	public int findLongestSubString(String str) {
		Set<Character> set = new HashSet<>();
		int left =0;
		int length=0;
		for(int i=0; i<str.length(); i++) {
			while(set.contains(str.charAt(i))) {
				set.remove(str.charAt(left));
				left++;
			}
			set.add(str.charAt(i));
			length = Math.max(length, i-left+1);
		}
		return length;
	}
	//Move zero to right
	public void moveZero(int arr[]) {
		int j=0;
		for(int i=0;i<arr.length; i++) {
			if(arr[i] !=0) {
				int temp = arr[i];
				arr[i]= arr[j];
				arr[j]=temp;
				j++;
			}
		}
		for(int num : arr) {
			System.out.println(num);
		}
	}
	//Move negatives to one side
	public void moveNegative(int arr[]) {
		int j=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>0) {
				int temp = arr[i];
				arr[i]= arr[j];
				arr[j]= temp;
				j++;
			}
		}
		for(int a : arr) {
			System.out.println(a);
		}
		
	}
	//Remove duplicates in-place
	public Set<Integer> rmDuplicate(int arr[]) {
		Map<Integer, Integer> map = new HashMap<>();
		Set<Integer> set = new LinkedHashSet<>();
		for(int a : arr) {
			set.add(a);
			
		}
		return set;
	}
	
	//Reverse Array using two pointer
	public void reverseArray(int arr[]) {
		int left = 0;
		int right = arr.length-1;
		
		while(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right]= temp;
			left++;
			right--;
		}
		for(int a : arr) {
			System.out.println(a);
		}
		
	}
	//Pair with given sum in sorted array
	public boolean findPairOfNumber(int arr[], int num) {
		int right = arr.length-1;
		int left = 0;
		Arrays.sort(arr);
		while(left<right) {
			int sum = arr[left] + arr[right];
			if(sum==num) return true;
			else if(sum>num) {
				right --;
			}else {
				left++;
			}
		}
		return false;
	}
	

}
