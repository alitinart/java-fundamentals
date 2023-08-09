import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * Reverse Array

 * The reverse method in Section  7.7 reverses an array by
 * copying it to a new array. Rewrite the method that reverses the array passed in
 * the argument and returns this array. Write a test program that prompts the user to
 * enter ten numbers, invokes the method to reverse the numbers, and displays the
 * numbers.
 *
 */
public class ReverseArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");

        int[] numbers = new int[10];
        for(int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Array: " + Arrays.toString(numbers));
        reverseArray(numbers);
    }

    public static void reverseArray(int[] numbers) {
        for(int i = 0, j = numbers.length - 1; i < numbers.length / 2; i++, j--) {
            int firstNumber = numbers[i];
            int lastNumber = numbers[j];

            numbers[i] = lastNumber;
            numbers[j] = firstNumber;
        }

        System.out.println("Reversed Array: " + Arrays.toString(numbers));
    }
}
