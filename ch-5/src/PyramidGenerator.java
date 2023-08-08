import java.util.Scanner;

/**
 *
 * Pyramid

 * Write a program that prompts the user to enter an integer from
 * 1 to 15 and displays a pyramid, as shown in the following sample run:
 *
 */
public class PyramidGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int numRows = scanner.nextInt();

        for(int i = 0; i < numRows; i++) {
            // Print leading spaces
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print("  ");
            }

            // Print numbers in descending order
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Print numbers in ascending order (excluding 1)
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
