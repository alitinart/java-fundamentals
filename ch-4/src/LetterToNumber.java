import java.util.Scanner;

/**
 *
 * Write a program that prompts the user to enter a letter and displays its corresponding number,
 * based on the number pad of a old telephone.
 *
 */

public class LetterToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the letter from the user
        System.out.print("Enter a letter: ");
        char letter = scanner.next().toUpperCase().charAt(0);
        scanner.close();

        // Check if the letter is a valid alphabet character
        if (Character.isLetter(letter)) {
            int number = getCorrespondingNumber(letter);

            if (number != -1) {
                System.out.println("The corresponding number for letter '" + letter + "' is " + number);
            } else {
                System.out.println("The letter '" + letter + "' does not correspond to any number on the telephone keypad.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid alphabet letter.");
        }
    }

    public static int getCorrespondingNumber(char letter) {
        switch (Character.toUpperCase(letter)) {
            case 'A':
            case 'B':
            case 'C':
                return 2;
            case 'D':
            case 'E':
            case 'F':
                return 3;
            case 'G':
            case 'H':
            case 'I':
                return 4;
            case 'J':
            case 'K':
            case 'L':
                return 5;
            case 'M':
            case 'N':
            case 'O':
                return 6;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                return 7;
            case 'T':
            case 'U':
            case 'V':
                return 8;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                return 9;
            default:
                return -1; // Invalid letter
        }
    }

}
