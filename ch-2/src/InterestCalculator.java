import java.util.Scanner;

/*
*
*   Interest Calcuator
*
*   Write a program that reads in investment amount, annual interest rate and the number
*   of years and displays the future investment value
*
* */
public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Investment Amount: ");
        double investmentAmount = scanner.nextDouble();

        System.out.println("Monthly Interest rate: ");
        double monthlyInterestRate = scanner.nextDouble();

        System.out.println("Number of years: ");
        int numberOfYears = scanner.nextInt();

        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
        System.out.println("Your future investment value is: " + futureInvestmentValue);
    }
}
