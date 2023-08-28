import java.util.Scanner;

/**
 *
 * **7.5 Distinct Numbers

 * Write a program that reads in ten numbers and displays
 * the number of distinct numbers and the distinct numbers separated by exactly one
 * space (i.e., if a number appears multiple times, it is displayed only once). (Hint:
 * Read a number and store it to an array if it is new. If the number is already in the
 * array, ignore it.) After the input, the array contains the distinct numbers.
 *
 */
public class DistinctNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int count = 0;

        System.out.println("Enter ten numbers:");

        // Read ten numbers and store distinct numbers in the array
        for (int i = 0; i < 10; i++) {
            int num = input.nextInt();

            boolean isDistinct = true;
            for (int j = 0; j < count; j++) {
                if (num == numbers[j]) {
                    isDistinct = false;
                    break;
                }
            }

            if (isDistinct) {
                numbers[count] = num;
                count++;
            }
        }

        // Display the number of distinct numbers
        System.out.println("The number of distinct numbers is: " + count);

        // Display the distinct numbers separated by a single space
        System.out.print("The distinct numbers are:");
        for (int i = 0; i < count; i++) {
            System.out.print(" " + numbers[i]);
        }
    }
}
