import com.sun.source.tree.Tree;

import java.util.*;

/**
 *
 * **21.9 (Guess the capitals using maps)

 * Rewrite Programming Exercise 8.37 to store
 * pairs of each state and its capital in a map. Your program should prompt the user
 * to enter a state and should display the capital for the state
 *
 */
public class GuessCapitalsGame {
    public static void main(String[] args) {
        TreeMap<String, String> statesAndCapitals = new TreeMap<>() {
            {
                put("California", "Sacramento");
                put("Montana", "Helena");
                put("Idaho", "Boise");
                put("Texas", "Austin");
                put("Oregon", "Salem");
                put("Washington", "Olympia");
                put("Florida", "Tallahassee");
                put("Oklahoma", "Oklahoma City");
                put("New York", "Albany");
                put("Ohio", "Columbus");
            }
        };

        List<String> statesList = new ArrayList<>(statesAndCapitals.keySet());
        String randomState = statesList.get(new Random().nextInt(statesList.size()));
        String randomCapital = statesAndCapitals.get(randomState);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the capital of: " + randomState);
        String answer = scanner.nextLine();

        if(answer.equalsIgnoreCase(randomCapital)) {
            System.out.println("Correct !");
            System.out.println("The capital of " + randomState + " is " + randomCapital);
            scanner.close();
            return;
        }

        System.out.println("Incorrect !");
        System.out.println("The capital of " + randomState + " is " + randomCapital);
        scanner.close();
    }
}
