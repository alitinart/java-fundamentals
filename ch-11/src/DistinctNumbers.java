import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * Listing 11.9
 *
 * Gives a program that prompts the user to enter a sequence of numbers and
 * displays the distinct numbers in the sequence. Assume that the input ends with 0 and 0 is not
 * counted as a number in the sequence.
 *
 */
public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers ( input ends with 0 ): ");
        ArrayList<Integer> list = new ArrayList<>();
        int value;

        do {
            value = scanner.nextInt();

            if(!list.contains(value) && value != 0) {
                list.add(value);
            }
        } while (value != 0);

        for(Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
