/**
 *
 * Display Prime Numbers less than 120

 * Write a program that displays all the prime
 * numbers less than 120 in decreasing order. Use the StackOfIntegers class
 * to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in
 * reverse order.
 *
 */
public class DisplayPrimeNumbers {
    public static void primeNumbers() {
        int endNumber = 120;

        StackOfIntegers stack = new StackOfIntegers();

        for(int i = endNumber; i > 0; i--) {
            if(MyInteger.isPrime(i)) {
                stack.push(i);
            }
        }

        while(!stack.empty()) {
            System.out.println(stack.pop() + " ");
        }
    }

    public static void main(String[] args) {
        primeNumbers();
    }
}
