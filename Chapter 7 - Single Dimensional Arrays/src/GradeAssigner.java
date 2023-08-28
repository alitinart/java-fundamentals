import java.util.Scanner;

/**
 *
 * *7.1 Grade Assigner

 * Write a program that reads student scores, gets the best score,
 * and then assigns grades based on the following scheme:
 * Grade is A if score is Ú best - 10
 * Grade is B if score is Ú best - 20;
 * Grade is C if score is Ú best - 30;
 * Grade is D if score is Ú best - 40;
 * Grade is F otherwise.
 * The program prompts the user to enter the total number of students, then prompts
 * the user to enter all of the scores, and concludes by displaying the grades.
 *
 */
public class GradeAssigner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many scores will you enter: ");
        int numberOfScores = scanner.nextInt();
        System.out.println("Enter test scores: ");

        int[] scores = new int[numberOfScores];

        for(int i = 0; i < numberOfScores; i++) {
            scores[i] = scanner.nextInt();
        }

        assignGrades(scores);
    }

    public static void assignGrades(int[] scores) {
        int highestScore = 0;
        for(int i = 0; i < scores.length; i++) {
            int currentScore = scores[i];
            if (highestScore < currentScore) {
                highestScore = currentScore;
            }

            char grade;

            if (currentScore >= 100 - 10) {
                grade = 'A';
            } else if (currentScore >= 100 - 20) {
                grade = 'B';
            } else if (currentScore >= 100 - 30) {
                grade = 'C';
            } else if (currentScore >= 100 - 40) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("Student " + i + " score is " + currentScore + " and grade is " + grade);
            System.out.println("Best score is: " + highestScore);
        }
    }
}
