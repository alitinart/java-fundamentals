import java.util.Scanner;

/**
 *
 * *22.3 (Pattern matching)

 * Write a program that prompts the user to enter two strings
 * and tests whether the second string is a substring of the first string. Suppose
 * the neighboring characters in the string are distinct. (Don’t use the indexOf
 * method in the String class.) Analyze the time complexity of your algorithm.
 * Your algorithm needs to be at least O(n) time.
 *
 */
public class PatternMatching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string number one: ");
        String s1 = scanner.nextLine();
        System.out.println("Enter string number two");
        String s2 = scanner.nextLine();

        String currentPattern = "";
        int startIndex = -1;
        for(int i = 0; i < s1.length(); i++) {
            if(currentPattern.equals(s2)) {
                break;
            }
            char s1Char = s1.charAt(i);
            if(s1Char == s2.charAt(currentPattern.length())) {
                if(startIndex == -1)
                    startIndex = i;
                currentPattern += s1Char;
                continue;
            }
            currentPattern = "";
            startIndex = -1;
        }

        System.out.println("Pattern starts at index: " + startIndex);
    }
}
