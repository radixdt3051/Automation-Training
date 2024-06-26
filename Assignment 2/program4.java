package PracticeAssignment;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class program4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the year you started the job: ");
        int startYear = scanner.nextInt();
   
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        Month currentMonth = currentDate.getMonth();

      
        int yearsOfExperience = currentYear - startYear;
        int monthsOfExperience = currentMonth.getValue();

     
        if (yearsOfExperience < 22 && yearsOfExperience <= 40) {
            System.out.println("Candidate is eligible.");
            System.out.println("Total experience: " + yearsOfExperience + " years and " + monthsOfExperience + " months.");
        } else {
            System.out.println("Candidate is not eligible.");
            System.out.println("Total experience: " + yearsOfExperience + " years and " + monthsOfExperience + " months.");
        }

        scanner.close();
    }
}