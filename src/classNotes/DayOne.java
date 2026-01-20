package classNotes;

import java.util.LinkedList;
import java.util.List;

public class DayOne {

	public static void main(String[] args) {
		DayOne done = new DayOne();
		List<Integer> list = new LinkedList<>();
		int digit = done.countDigit(1234);
		System.out.println(digit);
		int sum = done.sumOfNumber(1234);
		System.out.println(sum);
		done.checkPrime(15);
		list =done.checkPrime(10,20);
		System.out.println(list);

		boolean result = done.checkPalindrome(1221);
		System.out.println(result);
		boolean result1 = done.checkStrongNumber(145);
		System.out.println(result1);
		int value = done.findFactorial(3);
		System.out.println(value);


	}
	// find factorial 
	public int findFactorial(int num) {
		int factorial = 1;
		for(int i= num; i>=1; i--) {
			factorial = factorial*i;
		}
		return factorial;
	}
	//check Strong Number
	public boolean checkStrongNumber(int num) {
		int factorial = 1;
		int num1= num;
		int total = 0;
		while(num>0) {
			factorial =1;
			int digit = num%10;
			for(int i= digit; i>=1 ; i--) {
				factorial = factorial * i;
			}
			total = total + factorial;
			num= num/10;
		}
		if(num1 == total) return true;
		return false;
	}
	//check Palindrome 
	public boolean checkPalindrome(int num) {
		int reverse = 0;
		int num1 = num;
		while(num>0) {
			int digit = num%10;
			reverse = reverse*10 + digit;
			num = num/10;	
		}
		System.out.println(reverse);
		if(num1 == reverse) return true;
		return false;
	}
	//check prime between two numbers
	public List<Integer> checkPrime(int num1 , int num2) {
		int count = 0;
		List<Integer> list =new LinkedList<>();
		for(int i=num1; i<=num2 ; i++) {
			count =0;
			for(int j=2 ; j<=num2 ; j++) {
				if(i%j == 0 && i%1==0) {
					count++;
				}
			}
			if(count ==1) {
				list.add(i);
			}
		}
		return list;
	}
	//number is prime or not
	public void checkPrime(int num) {
		int total = 0;
		for(int i=2; i<=num ; i++) {
			if(num%i == 0 && num%1==0) {
				total++;
			}	
		}
		if(total == 1) {
			System.out.println(num + " is prime number");
		}else {
			System.out.println(num + " is not a prime number");
		}
	}
	//Add the digit of a number 1234
	public int sumOfNumber(int num) {
		int sum = 0;
		while(num>0) {
			int digit = num%10;
			sum = digit + sum;
			num = num/10;
		}
		return sum;
	}
	//count the digit of a number 1234
	public int countDigit(int num) {
		int count =0;
		while(num>0) {
			num = num/10;
			count++;
		}
		return count;
	}

}
