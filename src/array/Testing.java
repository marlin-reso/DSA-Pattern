package array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class Testing {

	public static void main(String[] args) {
		Testing ts = new Testing();
	//	ts.reverse("programming");
	//	firstPattern();
	//	ts.rightAngleTrangle();
	//	ts.invertedRightAngel();
	//	ts.rightAllignedAngel();
	//	ts.reverseNumber(1234);
	//	ts.reverseString("Sanjay");
	//	ts.reverseNumber(12345);
	//	ts.checkPalindrome(12344321);
	//	ts.checkPalindrome("abba");
	    ts.countDigit(23456);
		
		
		
		
	}
	public void countDigit(int num) {
		int count =0;
		while(num != 0) {
			
			}
		}
		
	
	public void checkPalindrome(int num) {
		int reverse = 0;
		int value = num;
		while(num !=0) {
			int digit = num%10;
			reverse = reverse*10 + digit;
			num = num/10;
		}
		if(reverse == value) {
			System.out.println(reverse);
			System.out.println(value + " is palindrome");
		}else {
			System.out.println(reverse);
			System.out.println(value + " is not palindrome");
		}
	}
	public void checkPalindrome(String str) {
		String reverse = "";
		for(int i= str.length()-1; i>=0 ;i--) {
			reverse = reverse + str.charAt(i);
		}
		if(str.equals(reverse)) {
			System.out.println(str + " is palindrome");
		}else {
			System.out.println(str + " is not palindrome");
		}
	}
	
	public void reverseString(String str) {
		
		for(int i = str.length()-1; i>=0; i--) {
		System.out.print(str.charAt(i));
		}
		
	}
	
	public void reverseNumber(int num) {
		int reverse =0;
		while( num != 0) {
			int digit = num%10;
			reverse = reverse * 10 + digit;
			num = num/10;
		}
		System.out.println(reverse);
	}
	
	
	public void rightAllignedAngel() {
		int row = 5;
		for(int i= 1 ; i<=row ; i++) {
			for(int j=1; j<=row-i;j++) {
				System.out.print(" ");
			}
			for(int k = 1; k<=i ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void invertedRightAngel() {
		int row = 5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void rightAngleTrangle() {
		int row = 6;
		for(int i=1; i<=row; i++) {
			for(int j=1 ; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void firstPattern() {
		int row = 4;
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=row;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public String reverse (String str) {
		List list = new ArrayList();
		for(char c : str.toCharArray()) {		
			for(int i= list.size()-1; i>=0 ; i--) {	
		}
		}
		for(int i= list.size()-1; i>=0 ; i--) {
			System.out.println();
		}
		System.out.println(list);
		return null;
	}

}
