package Technicalproblem;

import java.util.Scanner;

public class StudentsGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = 0;
        double avg;

        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks of subject " + i + ": ");
            int marks = sc.nextInt();
            total = total + marks;
        }

        avg = total / 5.0;

        System.out.println("Total = " + total);
        System.out.println("Average = " + avg);

        
        if (avg >= 80) {
            System.out.println("Grade: Distinction");
        } 
        else if (avg >= 60) {
            System.out.println("Grade: First Class");
        } 
        else if (avg >= 50) {
            System.out.println("Grade: Second Class");
        } 
        else {
            System.out.println("Grade: Fail");
        }
    }
}
