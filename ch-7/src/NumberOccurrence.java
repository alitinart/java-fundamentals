import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * **7.3 Number Occurrence

 * Write a program that reads the integers between 1
 * and 100 and counts the occurrences of each. Assume the input ends with 0.
 *
 */
public class NumberOccurrence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers between 1 and 100: ");
        String[] numbersAsStr = scanner.nextLine().split(" ");
        int[] numbers = new int[numbersAsStr.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsStr[i]);
        }

        numberOccurrence(numbers);
    }

    public static void numberOccurrence(int[] list) {
        for(int i = 0; i < list.length; i++) {
            int num = list[i];
            if (num != 0) {
                int occurrenceNumber = 0;

                for (int j = 0; j < list.length; j++) {
                    int selectedNum = list[j];
                    if (num == selectedNum) {
                        occurrenceNumber++;
                        list[j] = 0;
                    }
                }

                System.out.println(num + " occurs " + occurrenceNumber + " times.");
            }
        }
    }
}
