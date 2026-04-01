/*WAP in Java for result calculation of 5 subjects using an array where marks are given by the user. 
Output is total marks, average, grade, and result (pass/fail). Count subjects above 75 and below 40 and display them.*/

import java.util.Scanner;

public class Result_calculation {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for 5 subjects:");
        int[] marks = new int[5];

         for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks please enter marks between 0 and 100 for subject " + (i + 1));
            } else {
                System.out.println("Marks for subject " + (i + 1) + ": " + marks[i]);
            }
        }

            int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average: " + (double) totalMarks / marks.length);
        String grade;
        if (totalMarks >= 450) {
            grade = "A";
        } else if (totalMarks >= 400) {
            grade = "B";
        } else if (totalMarks >= 350) {
            grade = "C";
        } else if (totalMarks >= 300) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Grade: " + grade);
        if (grade.equals("F")) {
            System.out.println("Result: Fail");
        } else {
            System.out.println("Result: Pass");
        }

        int above75 = 0;
        int below40 = 0;
        for (int mark : marks) {
            if (mark > 75) {
                above75++;
            } else if (mark < 40) {
                below40++;
            }
        }
        System.out.println("Subjects above 75: " + above75);
        System.out.println("Subjects below 40: " + below40);

        sc.close();
    }
}