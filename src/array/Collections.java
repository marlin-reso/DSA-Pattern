package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
	//	Collections.arrayList();
		
	//	String str = Collections.reverseString("abcdef");
	//	System.out.println(str);
		/*
		int arr[] = { 1,0,3,0,5,0,4,6,0,6,7};
		moveZero(arr);
		for(int a : arr) {
			System.out.println(a);
		}
		*/
		
	//	Collections.repactChar("aaabbbcddfettttgffr");
		/*
		String abc = Collections.rmDuplicate("aaabbbbcccddddeee");
		System.out.println(abc);
		
		int arr[] = { 1,2,3,4,5,6,7};
		Collections.revserseArray(arr);
		
		for(int c : arr) {
			System.out.println(c);
		}
		
		
		
		int arr[] = { 10,20,30,48,49,55,66,70,69};
		
	int val=	Collections.secondLargest(arr);
	System.out.println(val);
		
	*/	
		
	//	Collections.palindrome("abcba");
		
		
		
		
		
		

	}
	
	
	public static void palindrome(String str) {
		String reverse = new StringBuilder(str).reverse().toString();
		
		if(str.equals(reverse)) {
			System.out.println("true");
			
		}else {
			System.out.println(false);
		}
	}
	
	public static int secondLargest(int arr[]) {
		
		Arrays.sort(arr);
		
		int secondLargest = arr[arr.length-2];
		
		return secondLargest;
		
		
	}
	
	
	public static void revserseArray(int arr[]) {
		
		int left = 0;
		int right = arr.length -1;
		while(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		
		
	}
	
	
	public static String rmDuplicate(String str) {
		Set<Character> set = new LinkedHashSet<>();
		
		for(char c : str.toCharArray()) {
			set.add(c);
		}
		
		StringBuilder sb = new StringBuilder();
	
		for(char c: set) {
			sb.append(c);
		}
		
		return sb.toString();
	}
	
	
	public static void repactChar(String str) {
		
		Map<Character, Integer> set = new LinkedHashMap<>();
		
		
		for(char c : str.toCharArray()) {
			set.put(c, set.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : set.entrySet()) {
			
			System.out.println(entry.getKey()+ " " + entry.getValue());
		}
		
		
		
		
	}
	
	public static int[] moveZero(int arr[]) {
		
		int j=0;
		for(int i=0; i<arr.length ; i++) {
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		
		return arr;
		
	}
	
	
	public static String reverseString(String str) {
		
		String reverse = new StringBuilder(str).reverse().toString();
		return reverse;
		
		
	}
	
	
	public static void arrayList() {
		
		List<String> list = new LinkedList<>();
		
		list.add("abc");
		list.add("best");
		list.add("Practice");
		list.add("single");
		
		System.out.println(list);
		
		List<String> list1 = new LinkedList<>();
		
		list.add("java");
		list.add("is");
		list.add("beautiful");
		
		
		list.addAll(list1);
		
		System.out.println(list);
		
		for(String c : list) {
			
			System.out.println(c);
			
		}
		
		
		
	}

}
