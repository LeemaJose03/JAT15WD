package day9;

import java.util.Scanner;

public class ArraySample {

	public static void main(String[] args) {
		
		// Data structure that allows you to store multiple values of same data type.
		// Collection of similar data type. 
		
		// 1. 
		
		Scanner sc = new Scanner(System.in);
		
		int[] numbers;   // declartion
		
		numbers =  new int[2]; // initalize the size of array
			
		// 2. 
		
		int[] nums = {10,20,30};
		
		//System.out.println(numbers.length);
//		for(int i =0; i<numbers.length; i++) {
//			
//			System.out.println("Enter a vale");
//			numbers[i] =  sc.nextInt();
//			
//		}
		 
		System.out.println(nums.length);
		
		for(int num : nums) {
			System.out.println(num);
		}
		
	
		String name = "Guvi";   // ivuG
		
		// charAt(0); 
		System.out.println(name.length());
		for(int i=0;i<name.length();i++) {
			
			System.out.print(name.charAt(i));
		}
		
		//num % 2 ==0   -- even number
		
		
	}

}
