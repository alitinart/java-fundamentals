import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * Count Numbers

 * Write a program that reads an unspecified number of integers, determines how many
 * positive and negative values have been read, and computes the total and average of
 * the input values (not counting zeros). Your program ends with the input 0. Display
 * the average as a floating-point number.
 *
 */
public class CountNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer, the input ends if it is 0: ");
        String[] numbers = scanner.nextLine().split(" ");

        System.out.println(Arrays.toString(numbers));

        int negativeNumbers = 0;
        int positiveNumbers = 0;
        int numberTotal = 0;

        for (String number : numbers) {
            int currentNumber = Integer.parseInt(number);

            if (currentNumber > 0) {
                positiveNumbers++;
            } else if (currentNumber < 0) {
                negativeNumbers++;
            } else {
                break;
            }

            numberTotal += currentNumber;
        }

        System.out.println("The number of positives is " + positiveNumbers);
        System.out.println("The number of negatives is " + negativeNumbers);
        System.out.println("Average is " + numberTotal / numbers.length);
    }
}
