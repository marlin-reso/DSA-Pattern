package array;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
	//	String str = "aabbbcdderff";
	//	String result = rmDuplicate(str);
	//	System.out.println(result);
		
		RemoveDuplicate.removeDuplicate();
		
		RemoveDuplicate.shiftZero();
		
		RemoveDuplicate.count();
		

	}
	
	public static void count() {
		
		String str = "aaabbbbccddder";
		
		Map<Character, Integer> set = new HashMap<>();
		
		for(char c : str.toCharArray()) {
			set.put(c, set.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : set.entrySet()) {
			
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
	}
	
	
	public static void removeDuplicate() {
		String str = "aabbbbcccddder";
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		for(char c: str.toCharArray()) {
			
			set.add(c);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(char c: set) {
			sb.append(c);
		}
		
		String fs = sb.toString();
		
		System.out.println(fs);
	}
	
	public static void shiftZero() {
		
		int arr[] = { 1,2,0,8,0,0,7,5};
		int j=0;
		
		for(int i=0; i< arr.length; i++) {
			
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] =  arr[j];
				arr[j] = temp;
				j++;
			}
		}
		
		for(int a : arr) {
			System.out.println(a);
		}
	}
	
	
	public static String rmDuplicate(String str) {
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		
		for(char c : str.toCharArray()) {
			set.add(c);
		}
		
		StringBuilder sb = new StringBuilder();
		for(char c: set) {
			sb.append(c);
		}
		
		
		return sb.toString();
	}

}
