package easy_medium_hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Easy {
	
	public static void main(String[] args) {
		
		//reverseString("apple");
		//revString("abcedfgh");
		
		int arr[] = {1,2,4,5,5,6,0,8,0,4};
		//revArray(arr);
		
	//	moveZero(arr);
		
	//	findLargest(arr);
		
	//	findSmallest(arr);
		
	//	secondLargest(arr);
	//	checkPalindrome("abcba");
		
	//	reverseNumber(1234);
		
	//	checkNumPalindrome(1223221);
		
	//	countString("Programming");
		
	//	remvoveDuplicate("programming");
		
	//	removeDuplicateFromArray(arr);
	//	moveZeroRight(arr);
		
		moveZeroLeft(arr);
		
		
		
		
	}
	
	public static void moveZeroLeft(int arr[]) {
		int j = arr.length-1;
		for(int i=arr.length-1; i<=0 ; i++) {
			if(arr[i] !=0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
		
		for(int c : arr) {
			System.out.println(c);
		}
	}
	
	public static void moveZeroRight(int arr[]) {
		int j =0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] !=0) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
			}
		}
		
		for(int c : arr) {
			System.out.println(c);
		}
	}
	
	// 17. Remove duplicate elements from an array
	public static void removeDuplicateFromArray(int arr[]) {
		
		Set<Integer> set = new LinkedHashSet<>();
		
		for(int c : arr) {
			set.add(c);
		}
		
		System.out.println(set);
	}
	
	public static void remvoveDuplicate(String str) {
		Set<Character> set = new LinkedHashSet<>();
		
		for(char c : str.toCharArray()) {
			set.add(c);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(char c : set) {
			sb.append(c);
		}
		
		System.out.println(sb.toString());
	}
	//13. Count number of vowels and consonants in a string
	public static void countVowelsAndConsonants(String str) {
		
		
	}
	
	public static void countString(String str) {
		Map<Character,Integer > set = new LinkedHashMap<>();
		
		for(char c : str.toCharArray()) {
			set.put(c, set.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : set.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
	
	
	
	public static void checkNumPalindrome(int value) {
		
		int orignal = value;
		
		int reverse = 0;
		while(value !=0) {
			int digit = value%10;
			reverse = reverse * 10 + digit;
			value = value/10;
		}
		
		System.out.println(reverse);
		
		if(orignal == reverse ) {
			System.out.println(orignal + " is palindrome");
		}else {
			System.out.println( orignal + " is not plaindorme");
		}
		
		
		
	}
	
	
	public static void reverseNumber(int val) {
		
		int reverse = 0;
		while(val !=0) {
			int digit = val % 10;
			reverse = reverse *10 + digit;
			
			val = val/10;
		}
		
		System.out.println(reverse);
		
	}
	
	public static void checkPalindrome(String str) {
		
		String reverse = new StringBuilder(str).reverse().toString();
		
		if(str.equals(reverse)) {
			System.out.println(str + " is palindrome");
			
		}else {
			System.out.println( str + " is not palindrome");
		}
	}
	
	
	
	
	public static  void secondLargest(int arr[]) {
		
		Arrays.sort(arr);
		
		int secondLargest = arr.length-2;
		
		System.out.println(secondLargest);
	}
	
	
	public static void findSmallest(int arr[]) {
		
		Arrays.sort(arr);
		
		int sortest = arr[0];
		System.out.println(sortest);
	}
	
	public static void findLargest(int arr[]) {
		
		Arrays.sort(arr);
		
		int val = arr.length-1;
		System.out.println(val);
	}
	
	public static void moveZero(int arr[]) {
		
		int j=0;
		
		for(int i=0; i<arr.length ; i++) {
			
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		
		for(int c: arr) {
			System.out.println(c);
		}
	}
	
	public static void revArray(int arr[]) {
		
		int left = 0;
		int right = arr.length-1;
		
		while(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right]  = temp;
			left++;
			right --;
		}
		
		for(int c : arr) {
			System.out.println(c);
		}
				
	}
	
	
	
	
	//reverse String without using inbuild method 
	public static void revString(String str) {
		
		char arr[] = str.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		for(int i= arr.length; i <= 0 ; i++) {
			sb.append(arr[i]);
			
		}
		System.out.println(sb.toString());
		
		
		
	}
	
	
	public static void reverseString(String str) {
		String reverse = new StringBuilder(str).reverse().toString();
		System.out.println(reverse);
	}

}
