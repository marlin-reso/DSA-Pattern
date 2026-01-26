package GPT;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;

public class Strings {

	public static void main(String[] args) {
		
		Strings two = new Strings();
		two.reverseString("Java is powerful language");
		two.countVowelAndConsonant("Programming");
		boolean value = two.checkAnagram("java programe", "programe java");
		System.out.println(value);
		Character value1 = two.findFirstNonRepeatingChar("aabbccddegg");
		System.out.println(value1);
		two.countFrequencyOfChar("programme");
		String value2 = two.rmDuplicateChar("programming");
		System.out.println(value2);
		String word = two.findLongestWord("Java is programing language");
		System.out.println(word);

	}
	//Find longest word in a sentence
	public String findLongestWord(String str) {
		String longestWord = " ";
		for(String word : str.split(" ")) {
			if(word.length()> longestWord.length()) {
				longestWord = word;
			}
		}
		return longestWord;
	}
	//Remove duplicate characters
	public String rmDuplicateChar(String str) {
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		for(char c : str.toCharArray()) {
			set.add(c);
		}
		StringBuilder sb = new StringBuilder();
		for(char c : set) {
			sb.append(c);
		}
		return sb.toString();
	}
	//Count frequency of characters
	public void countFrequencyOfChar(String str) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.print(entry.getKey()+ ""+ entry.getValue());
		}
	}
	//Find first non repeating character
	public Character findFirstNonRepeatingChar(String str) {
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println(map);
		
		for(Map.Entry<Character,Integer> entry : map.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}
		}
		return null;
		
	}
	//check anagram
	public boolean checkAnagram(String str1, String str2) {
		
		str1 = str1.replaceAll(" ", "").toLowerCase();
		str2 = str2.replaceAll(" ", "").toLowerCase();
		System.out.println(str1 + " and " + str2);
		if(str1.length() != str2.length()) return false;
		char s1[]= str1.toCharArray();
		char s2[]= str2.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		return Arrays.equals(s1, s2);
	}
	
	//Reverse each word in a sentence
	public String reverseString(String str) {
		//approach one
		String reverse = new StringBuilder(str).reverse().toString();
		System.out.println(reverse);
		return reverse;
	}
	//Count Vowel and Consonant
	public void countVowelAndConsonant(String str) {
		int vowel = 0;
		int consonent = 0;
		str = str.toLowerCase();
		
		for(char c : str.toCharArray()) {
			if(c=='a' || c =='e'|| c == 'i' || c=='o'|| c=='u') {
				vowel++;
			}else {
				consonent++;
			}
			
		}
		System.out.println(vowel);
		System.out.println(consonent);
	}

}
