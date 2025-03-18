import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Get student score from user input
        double score = getStudentScore();
        
        // Determine the grade
        String grade = calculateGrade(score);
        
        // Display the result
        System.out.println("Your Grade is: " + grade);
    }

    // Method to get student's score
    public static double getStudentScore() {
        Scanner input = new Scanner(System.in);
        double score = -1;
        
        // Loop until a valid score is entered
        while (score < 0 || score > 100) {
            System.out.print("Enter your score (0-100): ");
            
            // Validate input
            if (input.hasNextDouble()) {
                score = input.nextDouble();
                if (score < 0 || score > 100) {
                    System.out.println("Invalid score. Please enter a value between 0 and 100.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.next(); // Consume invalid input
            }
        }
        
        input.close(); // Close scanner
        return score;
    }

    // Method to calculate letter grade
    public static String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
