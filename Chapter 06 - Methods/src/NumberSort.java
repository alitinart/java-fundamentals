import java.util.Scanner;

/**
 *
 * *6.5 Sort three numbers

 * Write a method with the following header to display three
 * numbers in increasing order
 *
 */
public class NumberSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInt = scanner.nextInt();
        int secondInt = scanner.nextInt();
        int thirdInt = scanner.nextInt();

        displaySortedNumbers(firstInt, secondInt, thirdInt);
    }

    public static void displaySortedNumbers(
            double num1, double num2, double num3) {
        double temp;

        if(num2 < num1 && num1 < num3) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        } else if (num3 < num1 && num1 < num2) {
            temp = num1;
            num1 = num3;
            num3 = num2;
            num2 = temp;
        } else if (num2 < num3 && num3 < num1) {
            temp = num3;
            num3 = num1;
            num1 = num2;
            num2 = temp;
        } else if(num1 < num3 && num3 < num2) {
            temp = num3;
            num3 = num2;
            num2 = temp;
        } else if(num3 < num2 && num2 < num1) {
            temp = num3;
            num3 = num1;
            num1 = temp;
        }

        System.out.println(num1 + " " + num2 + " " + num3);
    }
}
