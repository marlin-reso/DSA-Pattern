package easy_medium_hard;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class CheetSheetPractice {

	public static void main(String[] args) {
		CheetSheetPractice cs = new CheetSheetPractice();
//		String str = cs.reverseString("programming");
//		System.out.println(str);
//		
//		boolean check = cs.checkAnagram("kite", "ekti");
//		System.out.println(check);
//		
//		cs.findNonRepeatingCharacter("aaaabbbbccdeeffrh");
//		cs.countVowelAndConsonant("java is a good Programming");
//		String value = cs.rmDuplicates("Makkking");
//		System.out.println(value);
		
//		cs.allUniqueCharacter("Annapurna of The year");
		int arr[] = {1,3,0,6,0,3,8,9};
//		int value =cs.findSecondLargest(arr);
//		System.out.println(value);
		cs.moveAllZero(arr);
		
		
	}
	//Move all zeros to the end of an array
	public void moveAllZero(int arr[]) {
		int j=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		for(int a : arr) {
			System.out.println(a);
		}
	}
    //Find if a string has all unique characters
	public int findSecondLargest(int arr[]) {
		Arrays.sort(arr);
		return arr[arr.length-2];
	}
	//Find if a string has all unique characters
	public void allUniqueCharacter(String str) {
		str = str.replaceAll(" ", "").toLowerCase();
		Map<Character,Integer> map = new LinkedHashMap<>();
		for(char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.print(entry.getKey());
			}
		}
	}
	//Remove all duplicate characters from a string
	public String rmDuplicates(String str) {
		Set <Character> set = new LinkedHashSet<>();
		StringBuilder sb = new StringBuilder();
		for(char c : str.toCharArray()) {
			set.add(c);
		}
		for(char c : set) {
			sb.append(c);
		}
		return sb.toString();
		
	}
	//Count vowels and consonants in a string
	public void countVowelAndConsonant(String str) {
		str = str.replaceAll(" ", "").toLowerCase();
		int vowel = 0;
		int consonant = 0;
		for(char c : str.toCharArray()) {
			if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u') {
				vowel++;
			}else {
				consonant++;
			}
		}
		System.out.println(vowel + " " + consonant);
	}
	//Find the first non-repeating character in a string
	public void findNonRepeatingCharacter(String str) {
		Map<Character,Integer> map = new LinkedHashMap<>();
		Set<Integer> set = new HashSet<>();
		for(char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}
	//Check if two strings are anagrams
	public boolean checkAnagram(String str1, String str2) {
		str1 = str1.replaceAll(" ", "").toLowerCase();
		str2 = str2.replaceAll(" ", "").toLowerCase();
		if(str1.length() != str2.length()) return false;
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}
	//Reverse a string without using StringBuilder.reverse()
	public String reverseString(String str) {
		char [] arr = str.toCharArray();
		int left = 0;
		int right = arr.length-1;
		while(left<right) {
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		return new String(arr);
	}
	
	public String revString(String str) {
		String reverse = new StringBuilder(str).reverse().toString();
		return reverse;
	}
	

}
