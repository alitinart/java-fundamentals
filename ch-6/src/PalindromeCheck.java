import java.util.Scanner;

/**
 *
 * **6.3 Palindrome Check

 * Write the methods with the following headers
 * // Return the reversal of an integer, i.e., reverse(456) returns 654
 * public static int reverse(int number)

 * // Return true if number is a palindrome
 * public static boolean isPalindrome(int number)

 * Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is the same as itself. Write a test program that prompts the
 * user to enter an integer and reports whether the integer is a palindrome.
 *
 */
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type out number: ");
        int number = scanner.nextInt();

        isPalindrome(number);
    }

    public static void isPalindrome(int number) {
        int reversedNumber = reverse(number);

        if(reversedNumber == number) {
            System.out.println("The number " + number + " is a palindrome");
        } else {
            System.out.println("The number " + number + " is not a palindrome");
        }
    }

    public static int reverse(Integer number) {
        int num = number;
        int reversedNumber = 0;
        for(int i = 0; i < String.valueOf(number).length(); i++) {
            int currentDigit = num % 10;
            reversedNumber *= 10;
            reversedNumber += currentDigit;
            num /= 10;
        }

        System.out.println(reversedNumber);

        return reversedNumber;
    }
}
