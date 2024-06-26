package PracticeAssignment;

import java.util.Scanner;

public class program1 
{
	public static void main(String[] args) {
		int first, second, add, substract, multiply;
		float devide;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter two numbers : ");
		first = scanner.nextInt();
		second = scanner.nextInt();
		
		add = first + second;
		substract = first - second;
		multiply = first * second;
		devide = (float) first / second;
		
		System.out.println("Sum = " + add);
		System.out.println("Differnce = " + substract);
		System.out.println("Multiplication = " + multiply);
		System.out.println("Devision = " + devide);
	}
}


    