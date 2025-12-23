package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Random {
	
	public static void main(String[] args) {
		
		reverseString("123456");
		
		checkPalindrome("Apple");
		
		int arr[] = {0,119,21,0, 333,4,52,69,74};
		
		reverseArray(arr);
		
		secondLargest(arr);
		
		String str = rmDuplicate("valluuvullio");
		System.out.println(str);
		
		countFrequency("programmoing");
		
		moveZero(arr);
		
		mergeList();
		
		
		
		
	}
	
	public static void mergeList() {
		List list1 = new ArrayList();
		List list2 = new ArrayList();
		
		list1.add("apple");
		list2.add("Mango");
		
		list1.addAll(list2);
		
		System.out.println(list1);
		
	}
	
	public static void moveZero(int arr[]) {
		int j=0;
		
		for(int i=0; i< arr.length ; i++) {
			if(arr[i] != 0) {
			int temp = arr[i];
			 arr[i] = arr[j];
			 arr[j] = temp;
			 j++;
			}
		}
		
		printArray(arr);
	}
	
	public static void countFrequency(String str) {
		
		Map<Character, Integer> set = new LinkedHashMap<>();
		
		for(char c: str.toCharArray()) {
			set.put(c, set.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : set.entrySet()) {
			System.out.println(entry.getKey()+ " "+ entry.getValue());
		}
		
	}
	
	
	public static String rmDuplicate(String str) {
		
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
	
	public static void secondLargest(int arr[]) {
		
		Arrays.sort(arr);
		
		System.out.println("second largest is " + arr[arr.length-2]);
		
	}
	
	
	public static void reverseArray(int arr[]) {
		
		int left = 0;
		int right = arr.length-1;
		
		while(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		
		printArray(arr);
		
	}
	
	public static void printArray(int arr[]) {
		
		for(int c : arr) {
			System.out.println(c);
		}
	}
	
	
	
	public static void checkPalindrome(String str) {
		String reverse = new StringBuilder(str).reverse().toString();
		
		if(str.equals(reverse)) {
			System.out.println(str + " is Palindrome");
		}else {
			System.out.println(str + " is not Palindrome");
		}
		
	}
	
	
	
	public static void reverseString(String str) {
		
		String reverse = new StringBuilder(str).reverse().toString();
		
		System.out.println(reverse);
	}
	

}
