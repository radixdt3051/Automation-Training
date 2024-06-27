package PracticeAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class program3
{
    public static void main(String[] args) {
    	String FirstName, LastName;

    	Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter First Name : ");
		FirstName = scanner.nextLine();
		
		
		System.out.println("Enter Last Name : ");
		LastName = scanner.nextLine();
		
		
		String Result1 =  FirstName.concat(LastName);
		System.out.println(Result1);
		
		
		System.out.println("Enter First Name : ");
		FirstName = scanner.nextLine();
		
		
		System.out.println("Enter Last Name : ");
		LastName = scanner.nextLine();
		
		
		String Result2 =  FirstName.concat(LastName);
		System.out.println(Result2);
		

		System.out.println("Enter First Name : ");
		FirstName = scanner.nextLine();
		
		
		System.out.println("Enter Last Name : ");
		LastName = scanner.nextLine();
		
		
		String Result3 =  FirstName.concat(LastName);
		System.out.println(Result3);
		

		System.out.println("Enter First Name : ");
		FirstName = scanner.nextLine();
		
		
		System.out.println("Enter Last Name : ");
		LastName = scanner.nextLine();
		
		
		String Result4 =  FirstName.concat(LastName);
		System.out.println(Result4);
		

		System.out.println("Enter First Name : ");
		FirstName = scanner.nextLine();
		
		
		System.out.println("Enter Last Name : ");
		LastName = scanner.nextLine();
		
		
		String Result5 =  FirstName.concat(LastName);
		System.out.println(Result5);
		
		
		
		 String[] names = {Result1,Result2,Result3,Result4,Result5};
		  System.out.println(Arrays.toString(names));
		
		  Arrays.sort(names);

	        System.out.println("After sorting:");
	        System.out.println(Arrays.toString(names));
		
}
}