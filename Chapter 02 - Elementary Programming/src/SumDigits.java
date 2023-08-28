import java.util.Scanner;

/*
*   Sum Digits in number
*
*   Write a program that sums up all the digits in a number
*   Example: if an integer is 932, then the sum of the digits would be 14
*
* */
public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        int numberTotal = 0;

        while (number != 0) {
            int digit = number % 10;
            numberTotal += digit;
            number /= 10;
        }

        scanner.close();
        System.out.println("The sum of the digits is: " + numberTotal);
    }
}
