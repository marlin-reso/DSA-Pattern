package array;

import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String str = "aabbbcdderff";
		String result = rmDuplicate(str);
		System.out.println(result);
		

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
