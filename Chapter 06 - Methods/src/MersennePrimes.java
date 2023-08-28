/**
 *
 * Mersenne Primes

 * A prime number is called a Mersenne prime if it can be written
 * in the form 2p - 1 for some positive integer p. Write a program that finds all
 * Mersenne primes with p … 31 and displays the output as follows:
 *
 */
public class MersennePrimes {
    public static void main(String[] args) {
        for(int i = 0; i <= 31; i++) {
            System.out.println("p = " + i + "2^p-1 = " + (Math.pow(2, i) - 1));
        }
    }
}
