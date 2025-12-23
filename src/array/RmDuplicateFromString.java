package array;

import java.util.LinkedHashSet;

public class RmDuplicateFromString {

	public static void main(String[] args) {
		
		
		String str = "aaabbbbbcdddddd";
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		for(char c: str.toCharArray()) {
			set.add(c);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(char c: set) {
			sb.append(c);
		}
		
		String strr = sb.toString();
		System.out.println(strr);

	}

}
