import java.util.Scanner;

/**
 *
 * *18.9 (Print the characters in a string reversely)

 * Write a recursive method that displays a string reversely on the console using the following header:
 * public static void reverseDisplay(String value)
 *  For example, reverseDisplay("abcd") displays dcba. Write a test program
 * that prompts the user to enter a string and displays its reversal
 *
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string to reverse: ");
        String s = scanner.nextLine();

        reverseDisplay(s);
    }

    public static void reverseDisplay(String value){
        if (value.length() == 0) {
            return;
        } else {
            System.out.print(value.charAt(value.length() - 1));
            reverseDisplay(value.substring(0, value.length() - 1));
        }
    }
}
