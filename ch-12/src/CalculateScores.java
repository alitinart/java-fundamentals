import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * Process scores in a text file on the Web

 * Suppose that the text file on the
 * Web http://cs.armstrong.edu/liang/data/Scores.txt contains an unspecified number
 * of scores. Write a program that reads the scores from the file and displays their
 * total and average. Scores are separated by blanks.
 *
 */
public class CalculateScores {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
        System.out.println("Opening http://cs.armstrong.edu/liang/data/Scores.txt...");
        Scanner scanner = new Scanner(url.openStream());
        System.out.println("Calculating Scores...");
        ArrayList<Integer> scores = new ArrayList<>();

        while (scanner.hasNext()) {
            scores.add(Integer.parseInt(scanner.nextLine()));
        }

        int scoresTotal = 0;

        for (Integer score : scores) {
            scoresTotal += score;
        }

        System.out.println("Total of scores: " + scoresTotal);
        System.out.println("Average of scores: " + scoresTotal / scores.size());
    }
}
