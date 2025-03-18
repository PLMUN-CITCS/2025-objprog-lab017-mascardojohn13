import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        double score = getStudentScore();
        String grade = calculateGrade(score);
    
        System.out.println("Your Grade is: " + grade);
    }

    public static double getStudentScore() {
        Scanner input = new Scanner(System.in);
        double score = -1;
       
        while (score < 0 || score > 100) {
            System.out.print("Enter your score (0-100): ");
            

            if (input.hasNextDouble()) {
                score = input.nextDouble();
                if (score < 0 || score > 100) {
                    System.out.println("Invalid score. Please enter a value between 0 and 100.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.next(); 
        }
        
        input.close(); 
        return score;
    }

   
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
