package easy_medium_hard;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		
		
	//	int value = findGraterNum();
	//	System.out.println("Largest num is : "+ value);
		
	//	checkEvenOrOdd();
		
	//	checkLeapYear();
		swapNumber(10,20);

	}
	
	public static void swapNumber(int a , int b) {
		
		System.out.println("1st num is : "+a);
		System.out.println("2nd num is : "+b);
		
		if(true) {
			int temp = a;
			a = b;
			b= temp;
		}
		
		System.out.println("1st num is : "+a);
		System.out.println("2nd num is : "+b);
	}
	
	
	
	public static void checkLeapYear() {
		int val = 1;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Year : ");
		int year = sc.nextInt();
		
		
		if(year > 0 ) {
			
			if(year%4==0) {
				System.out.println(year + " is leap year");
			}else {
				System.out.println(year + " is not leap year");
			}
			
			
		}else {
			System.out.println("Enter the valid year");
		}
		
		System.out.println("Want to continue press 0 or to break press any button : ");
		val = sc.nextInt();
		
		}while(val ==0);
		
		
	}
	
	public static int findGraterNum() {
		
		Scanner sc = new Scanner(System.in);
		int largest =0;
		System.out.print("Enter the first Number : " );
		int a = sc.nextInt();
		 System.out.print("Enter the first Number : " );
		int b = sc.nextInt();
		System.out.print("Enter the first Number : "  );
		int c = sc.nextInt();
		 
		if(a > b & a> c) {
			largest = a;
			System.out.println(a + " is the largest");
			
		}else if(b>a & b>c){
			largest =b;
			System.out.println(b + " is the largest");
		}else {
			System.out.println(c + " is the largest");
			largest =c;
		}
		
		return largest;
	}
	
	public static void checkEvenOrOdd() {
		
		
		int num =1;
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the Number : ");
			int value = sc.nextInt();
			
			
			if(value%2 == 0) {
				System.out.println(value + " is even number");
			}else {
				System.out.println(value + " is odd number");
			}
			System.out.print("if you want to countinue press 0 : ");
			num = sc.nextInt();
			
			
		}while(num == 0);
		
	}

}
