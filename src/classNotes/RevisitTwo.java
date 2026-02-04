package classNotes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class RevisitTwo {

	public static void main(String[] args) {
		RevisitTwo rs = new RevisitTwo();
		int arr[]= {0,4,5,2,0,1,89,5,0,5,0,43};
	//	boolean result1=rs.checkPalindrome("abba1");
	//	System.out.println(result1);
		
	//	boolean result2 = rs.checkPalindrome(12211);
	//	System.out.println(result2);
	//	rs.reverseString("programming");
	//	String str = rs.rmDuplicate("Programming");
	//	System.out.println(str);
	//	rs.countChar("Programming");
		rs.moveZero(arr);

	}
	//move Zero
	public void moveZero(int arr[]) {
		int j=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]= temp;
				j++;
			}
		}
		for(int a : arr) {
			System.out.println(a);
		}
		
	}
	//count repeat char
	public void countChar(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for(char a : str.toCharArray()) {
			map.put(a, map.getOrDefault(a, 0)+1);
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ " "+ entry.getValue());
		}
		
	}
	//remove duplicate
	public String rmDuplicate(String str) {
		Set<Character> set = new LinkedHashSet<>();
		for(char a : str.toCharArray()) {
			set.add(a);
		}
		StringBuilder sb = new StringBuilder();
		for(char a : set) {
			sb.append(a);
		}
		
		return sb.toString();
	}
	
	//reverse String 
	public String reverseString(String str) {
		char [] ap = str.toCharArray();
		int left = 0;
		int right = ap.length-1;
		while(left<right) {
			char temp = ap[left];
			ap[left]= ap[right];
			ap[right]= temp;
			left++;
			right--;
		}
		for(char a : ap) {
			System.out.println(a);
		}
		
;		return null;
	}
	//check Palindrome
	public boolean checkPalindrome(String str) {
		String reverse = new StringBuilder(str).reverse().toString();
		if(str.length() <1) return false;
		if(str.equals(reverse)) return true;
		return false;
	}
	public boolean checkPalindrome(int num) {
		int reverse = 0;
		int num1 = num;
		while(num>0) {
			int digit = num%10;
			reverse = reverse*10 + digit;
			num = num/10;
		}
		if(num1 == reverse) return true;
		return false;
	}

}
