package officePractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class SessionOne {
	public static void main(String[] args) {
		
		SessionOne session = new SessionOne();
		int arr[] = {2,4,9,0,4,9,45,7,22,0,2};
		int arr1[]= {2,4,6,8,9,10};
		System.out.println(session.checkPalindrome("madame"));
		System.out.println(session.findSecondLargest(arr));
		int arr2[] = new int[arr.length];
		System.out.println(arr.length + " " + arr2.length);
		
		for(int a : session.reverseArray(arr1)) {
			System.out.println(a);
		}
		System.out.println(session.rmDuplicate("Programming"));
	}
	public String rmDuplicate(String str) {
		Map<Character, Integer> map = new HashMap<>();
		Set<Character> set = new LinkedHashSet<>();
		for(char c : str.toCharArray()) {
			set.add(c);
		}
		StringBuilder sb = new StringBuilder();
		for(char c : set) {
			sb.append(c);
		}
		return sb.toString();
	}
	
	
	public int[] reverseArray(int arr1[]) {
		int left = 0;
		int right = arr1.length-1;
		while(left<right) {
			int temp = arr1[left];
			arr1[left] = arr1[right];
			arr1[right]= temp;
			left++;
			right--;
		}
		
		return arr1;
	}
	
	public boolean checkPalindrome(String str) {
		String reverse = new StringBuilder(str).reverse().toString();
		if(str.equals(reverse)) {
		 return true;
		}
		else {
			return false;
		}
	}
	
	public int findSecondLargest(int arr[]) {
		Arrays.sort(arr);
		return arr[arr.length-2];
	}
	
	
		
	}

