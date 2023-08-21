import java.util.Scanner;

/**
 *
 * Case Study: Compute Factorials

 * 0! = 1;
 * n! = n × (n - 1)!; n > 0
 *
 */
public class ComputeFactorials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Compute factorial of the number: ");
        int n = scanner.nextInt();

        System.out.println(n + " factorial is equal to: " + computeFactorial(n));
    }

    public static int computeFactorial(int n) {
        if(n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            return n * computeFactorial(n - 1);
        }
    }
}
