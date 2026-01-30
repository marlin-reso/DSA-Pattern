package classNotes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Revisit {
	
	public static void main(String[] args) {
		Revisit re = new Revisit();
	//	boolean value = re.checkPalindrome("madame");
	//	System.out.println(value);
		int arr[]= {1,3,0,4,7,9,8};
		//int value = re.findSecondLargest(arr);
	//	System.out.println(value);
		int arr1[]= new int[arr.length];
	//	arr1 = re.reverseArray(arr);
	//	for(int a : arr1) {
	//		System.out.println(a);
	//	}
	//	String str = re.rmDuplicate("abbbbcdddd");
	//	System.out.println(str);
	//	re.countFrequency("programming");
	//	 arr1 =re.moveZero(arr);
	//	 for(int a : arr1) {
	//					System.out.println(a);
	//				}
	//	re.findLongestSubString("abcddefgh");
	//	re.reverseNumber(1234);
	//	re.findIndex(arr, 8);
	//	re.countEvenAndOdd(arr);
	//	boolean value = re.checkPrime(11);
	//	System.out.println(value);
		re.findFirstRepeatChar("lphabetp");
		
		
	}
	//check two strings are anagram
	public boolean checkAnagram(String str1, String str2) {
		str1 = str1.replaceAll(" ", "").toLowerCase();
		str2 = str2.replaceAll(" ", "").toLowerCase();
		char arr1[] =str1.toCharArray();
		char arr2[] = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}
	//find first repeat char
	public void findFirstRepeatChar(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for(char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(Map.Entry<Character, Integer>entry : map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}
	//check prime number
	public boolean checkPrime(int num) {
		for(int i=2; i<num/2 ; i++) {
			if(num%i==0) return false;
		}
		return true;
	}
	//count even and odd
	public void countEvenAndOdd(int arr[]) {
		int countEven=0;
		int countOdd=0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%2==0 && arr[i] != 0) {
				countEven++;
			}else if(arr[i] !=0){
				countOdd++;
			}
		}
		System.out.println("Even : "+countEven+" Odds : "+countOdd);
	}
	//find the index of giving element
	public void findIndex(int arr[], int num) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num) {
				System.out.println(i);
			}
		}
		
	}
	//reverse number
	public void reverseNumber(int num) {
		
		int reverse =0;
		while(num>0) {
			int digit= num%10;
			reverse = reverse *10 + digit;
			num = num/10;
			
		}
		System.out.println(reverse);
	}
	//find longest substring
	public void findLongestSubString(String str) {
		Set<Character> set = new HashSet<>();
		int left = 0;
		int length =0;
		for(int i=0;i<str.length();i++) {
			while(set.contains(str.charAt(i))) {
				set.remove(str.charAt(left));
				left++;
			}
			set.add(str.charAt(i));
			length = Math.max(length, i-left+1);
		}
		System.out.println(length);
	}
	//Move zero
	public int[] moveZero(int arr[]) {
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		return arr;
		
	}
	//count the frequency
	public void countFrequency(String str) {
		Map<Character,Integer> map = new HashMap<>();
		for(char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
	}
	//remove duplicate
	public String rmDuplicate(String str) {
		Set<Character> set = new HashSet<>();
		for(char c : str.toCharArray()) {
			set.add(c);
		}
		StringBuilder sb = new StringBuilder();
		for(char c : set) {
			sb.append(c);
		}
		return sb.toString();
	}
	public int[] reverseArray(int arr[]) {
		int left = 0;
		int right = arr.length-1;
		while(left<right) {
			int temp = arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		return arr;
	}
	public boolean checkPalindrome(String str) {
		String reverse = new StringBuilder(str).reverse().toString();
		if(str.equals(reverse)) return true;
		else return false;
	}
	public int findSecondLargest(int arr[]) {
		Arrays.sort(arr);
		int secondLargest =arr[arr.length-2];
		return secondLargest;
	}

}
