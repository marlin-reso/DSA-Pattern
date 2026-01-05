package easy_medium_hard;

public class Reverse {
	
	public static void main(String[] args) {
		
		revNumber(1234);
		
		revString("Apna");
		
	}
	
	
	public static void revString(String str) {
		
		String rev = new StringBuilder(str).reverse().toString();
		
		System.out.println(rev);
		
	}
	
	
	public static void revNumber(int num) {
		
		
		int reverse = 0;
		
		while(num != 0) {
			
			int digit = num%10;
			
			reverse = reverse *10 + digit;
			
			num = num/10;
			
			
			
			
		}
		
		System.out.println(reverse);
		
		
	}

}
