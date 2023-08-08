import java.util.Scanner;

/*
*   *2.5 Calculate Tips
*
*   Write a program that calculate tips that reads the subtotal and the gratuity rate
*   then computes the gratuity rate and total.
*  */
public class CalculateTips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your subtotal and gratuity rate eg. 10 15: ");

        int total = scanner.nextInt();
        double gratuity = scanner.nextDouble() / 100;

        double tipAmount = total * gratuity;

        scanner.close();
        System.out.println("Tip amount: " + tipAmount);
        System.out.println("Total + tip: " + (total + tipAmount));
    }
}
