package com.design.pattern.exercises.srp.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SingleResponsabilityPrinciple {

	public static final int THRESHOLD = 5;

	public static void main(String[] args) {
		List<Integer> nums = readInput();
		sortNumbers(nums);
		printNumbers(nums);
	}

	public static  List<Integer> readInput() {
		Scanner scanner = new Scanner(System.in);
		List<Integer> nums = new ArrayList<>();
		System.out.println("Enter 5 valid integers in the range [0, 10]");

		while(nums.size() < THRESHOLD) {
			String s = scanner.nextLine();
			if(!isParsableToInteger(s)) {
                System.out.println("Invalid! Try again!");
				continue;
			}
			int num = Integer.parseInt(s);
			if(!isNumberInRange(num)){
                System.out.println("Invalid range! Try again!");
				continue;
			};
			nums.add(num);
		}

		scanner.close();
		return nums;
	} 

	public static boolean isParsableToInteger(String val){
		try {
			Integer.parseInt(val);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
	
	public static boolean isNumberInRange(Integer num) {
		if(num<0 || num > 10) {
			return false;
		}
		return true;
	}
	
	public static void sortNumbers(List<Integer> nums) {
		Collections.sort(nums);
	}

	public static void printNumbers(List<Integer> nums) {
		for(int num : nums)
			System.out.print(num+" ");
	}
}
