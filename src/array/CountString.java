package array;

import java.util.HashMap;
import java.util.Map;

public class CountString {

	public static void main(String[] args) {
		
		String str = "aabbccccdddef";
		
		Map<Character, Integer> set = new HashMap<>();
		
		for(char c: str.toCharArray()) {
			
			set.put(c, set.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : set.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}
	

}
