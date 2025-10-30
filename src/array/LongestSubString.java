package array;

import java.util.HashSet;

public class LongestSubString {

	public static void main(String[] args) {
		String str = "abcdbbca";
		int result = longestSubString(str);
		System.out.println(result);
		

	}
	
	public static int longestSubString(String str) {
		int n = str.length();
		HashSet<Character> seen= new HashSet<>();
		int maxLength = 0;
		int left = 0;
		
		//Expend the window by moving right
		for(int right =0 ; right<n ;right ++) {
			//if a duplicate found shrink the window from the left
			while(seen.contains(str.charAt(right))) {
				seen.remove(str.charAt(left));
				left++;
			}
			
			//Add current character to window and update max length
			seen.add(str.charAt(right));
			maxLength = Math.max(maxLength, right-left+1);
			
		}
		return maxLength;
		
			
	}

}
