//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Gradecal {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subject you want to add:");
        int subNumber = sc.nextInt();
        float[] Marks = new float[subNumber];

        for(int i = 0; i < subNumber; ++i) {
            System.out.println("Enter Marks for subject  " + (i + 1) + ":");
            Marks[i] = sc.nextFloat();
        }

        float totalMarks = 0.0F;

        for(int i = 0; i < Marks.length; ++i) {
            totalMarks += Marks[i];
        }

        double averageMarks = 0.0;
        averageMarks = (double)(totalMarks / (float)subNumber);
        System.out.println("\nYour MarkSheet");
        System.out.println("Results:");

        for(int i = 0; i < subNumber; ++i) {
            System.out.println("Marks obtained in Subject " + (i + 1) + " are " + Marks[i]);
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averageMarks);
        String grade = calculateGrade(averageMarks);
        System.out.println("Grade: " + grade);
        sc.close();
    }

    private static String calculateGrade(double averageMarks) {
        if (averageMarks >= 90.0) {
            return "A";
        } else if (averageMarks >= 80.0) {
            return "B";
        } else if (averageMarks >= 70.0) {
            return "C";
        } else {
            return averageMarks >= 60.0 ? "D" : "F";
        }
    }
}
