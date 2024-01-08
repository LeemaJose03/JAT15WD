package day9;

import java.util.Scanner;

public class ControlStatements {

	public static void main(String[] args) {
		 
		// How to get and print value in console.
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter age: ");
		//int age = sc.nextInt();   // int num =10; 
		
		//Control statements:
		
		// if  -- 
		/*if(age > 18) {
			
			System.out.println("Eligible to vote");
		}
		
		System.out.println("End of code"); */
		
		// if else 
		
		/*if(age > 18) {
			
			System.out.println("Eligible to vote");
		} else {
			
			System.out.println("Not Eligible to vote");
		} */
		
//		int a =sc.nextInt();
//		int b = sc.nextInt();
//		
//			if(a==10){
//				if(b!=20) {
//					System.out.println("Valid data");
//				} else {
//					System.out.println("Invalid data");
//				}
//			}
		
		// if-else-if ladder
		
//		int marks = sc.nextInt();
//			
//		if(marks <100 && marks >90) {
//			
//			System.out.println("Grade O");
//			
//		} else if(marks <90 && marks > 70) {
//			
//			System.out.println("Grade A");
//			
//		} else if(marks <70 && marks >40) {
//			
//			System.out.println("Grade B");
//		}
//		
//		else {
//			
//			System.out.println("Fail");
//		}
//		
		
		// switch case
		
		char day = sc.next().charAt(0);
		
		switch(day) {
		
		case 'a': 
			System.out.println("Monday");
		break; 
		
		case 'b':
			System.out.println("Tuesday");
		break;
		
		case 'c':
			System.out.println("Wednesday");
		break;
		
		default:
				System.out.println("Invalid day");
		}
	}
	
		
	
	
}
