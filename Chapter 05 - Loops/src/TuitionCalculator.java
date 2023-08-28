/**
 *
 * Tuition Calculator

 * Suppose that the tuition for a university is $10,000 this year and increases 5% every year. In one year, the tuition
 * will be $10,500. Write a program that computes the tuition in ten years and the
 * total cost of four years’ worth of tuition after the tenth year
 *
 */
public class TuitionCalculator {
    public static void main(String[] args) {
        int tuitionStart = 10_000;
        double interestPerYear = 0.05; // <-- This is equivalent to 5%

        int tuitionAfterTenYears = tuitionStart;
        int tuitionCostFourYears = tuitionStart;

        for(int i = 0; i < 10; i++) {
            if (i < 5)
                tuitionCostFourYears += tuitionAfterTenYears;

            tuitionAfterTenYears *= (1 + interestPerYear);
        }

        System.out.println("The tuition after ten years will cost: " + tuitionAfterTenYears);
        System.out.println("The tuition for four years will cost: " + tuitionCostFourYears);
    }
}
