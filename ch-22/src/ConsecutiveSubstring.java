import java.util.Scanner;

/**
 *
 * *22.1 (Maximum consecutive increasingly ordered substring)

 * Write a program that
 * prompts the user to enter a string and displays the maximum consecutive
 * increasingly ordered substring. Analyze the time complexity of your program.
 *
 */

// Code below has a time complexity of O(n^2)

public class ConsecutiveSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sequence of strings: ");
        String sequence = scanner.nextLine();

        String longestSequence = "";
        String sortedSequence = "";
        int start = 0;
        for(int i = 0; i < sequence.length() + 1; i++) {
            sortedSequence = sequence.substring(start, i);
            if(!isAlphabetical(sortedSequence)){
                start = i - 1;
                if(sortedSequence.length() > longestSequence.length()) {
                    longestSequence = sortedSequence.substring(0, sortedSequence.length() - 1);
                    continue;
                }

                sortedSequence = "";
            }

            if(sortedSequence.length() > longestSequence.length()) {
                longestSequence = sortedSequence;
            }
        }

        System.out.println("Longest Sequence in string is: " + longestSequence);
    }

    public static boolean isAlphabetical(String s) {
        char[] charArray = s.toCharArray();

        for(int i = 1; i < charArray.length; i++) {
            char current = charArray[i];
            char previous = charArray[i - 1];
            if(current < previous) {
                return false;
            }
        }

        return true;
    }
}

