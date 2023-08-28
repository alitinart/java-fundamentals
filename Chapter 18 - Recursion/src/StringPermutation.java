import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * **18.25 (String permutation)
 * Write a recursive method to print all the permutations of a
 * string. For example, for the string abc, the permuation is
 * abc
 * acb
 * bac
 * bca
 * cab
 * cba
 *
 */
public class StringPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        displayPermutation(input);
    }

    public static void displayPermutation(String s) {
        displayPermutation("", s);
    }

    public static void displayPermutation(String s1, String s2) {
        if (s2.isEmpty()) {
            System.out.println(s1);
        } else {
            for (int i = 0; i < s2.length(); i++) {
                char currentChar = s2.charAt(i);
                String newS1 = s1 + currentChar;
                String newS2 = s2.substring(0, i) + s2.substring(i + 1);
                displayPermutation(newS1, newS2);
            }
        }
    }
}
