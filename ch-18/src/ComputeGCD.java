import java.util.Scanner;

/**
 *
 * *18.3 (Compute greatest common divisor using recursion)

 * The gcd(m, n) can also
 * be defined recursively as follows:
 *  ■ If m % n is 0, gcd(m, n) is n.
 *  ■ Otherwise, gcd(m, n) is gcd(n, m % n).
 *  Write a recursive method to find the GCD. Write a test program that prompts the
 * user to enter two integers and displays their GCD.
 *
 */
public class ComputeGCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int m = scanner.nextInt();
        System.out.println("Enter second number: ");
        int n = scanner.nextInt();

        System.out.println("GCD: " + computeGCD(m, n));
    }

    public static int computeGCD(int m, int n) {
        if(m % n == 0) {
            return n;
        } else {
            return computeGCD(n, m % n);
        }
    }
}
