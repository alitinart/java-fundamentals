import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * **22.8 (All prime numbers up to 10,000,000,000)

 * Write a program that finds
 * all prime numbers up to 10,000,000,000. There are approximately
 * 455,052,511 such prime numbers. Your program should meet the following
 * requirements:

 * ■ Your program should store the prime numbers in a binary data file, named
     * PrimeNumbers.dat. When a new prime number is found, the number is
     * appended to the file.

 * ■ To find whether a new number is prime, your program should load the
     * prime numbers from the file to an array of the long type of size 10000.
     * If no number in the array is a divisor for the new number, continue to read
     * the next 10000 prime numbers from the data file, until a divisor is found
     * or all numbers in the file are read. If no divisor is found, the new number
     * is prime.

 * ■ Since this program takes a long time to finish, you should run it as a batch
     * job from a UNIX machine. If the machine is shut down and rebooted, your
     * program should resume by using the prime numbers stored in the binary data
     * file rather than start over from scratch.
 *
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        long startNumber = 2;
        long maxNumber = 10_000_000_000L;
        List<Long> primes = loadStoredPrimes();

        for (long num = startNumber; num <= maxNumber; num++) {
            if (isPrime(num, primes)) {
                storePrime(num);
                primes.add(num);
            }
        }
    }

    public static List<Long> loadStoredPrimes() {
        List<Long> primes = new ArrayList<>();

        try(
                Scanner scanner = new Scanner(new File("PrimeNumbers.dat"))
                ) {
            while (scanner.hasNextLong()) {
                primes.add(scanner.nextLong());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File was not found");
            primes.add(1L);
        }
        return primes;
    }

    public static boolean isPrime(long num, List<Long> primes) {
        for (long prime : primes) {
            if (prime * prime > num) {
                break;
            }
            if (num % prime == 0) {
                return false;
            }
        }
        return true;
    }

    public static void storePrime(long prime) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("PrimeNumbers.dat", true))) {
            dos.writeLong(prime);
        } catch (IOException ex) {
            System.out.println("Error writing to file: " + ex.getMessage());
        }
    }
}
