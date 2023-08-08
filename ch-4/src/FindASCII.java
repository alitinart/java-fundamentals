import java.util.Scanner;

/**
 *
 * Write a program that receives an ASCII code
 * (an integer between 0 and 127) and displays its character
 *
 */

public class FindASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the ASCII code from the user
        System.out.print("Enter an ASCII code (between 0 and 127): ");
        int asciiCode = scanner.nextInt();
        scanner.close();

        // Check if the ASCII code is within the valid range (0 to 127)
        if (asciiCode >= 0 && asciiCode <= 127) {
            // Convert the ASCII code to a character
            char character = (char) asciiCode;

            // Display the result
            System.out.println("The character for ASCII code " + asciiCode + " is " + character);
        } else {
            System.out.println("Invalid ASCII code. Please enter a number between 0 and 127.");
        }
    }
}
