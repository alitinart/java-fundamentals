/**
 *
 * StopWatch Class

 * Design a class named StopWatch. The class contains:
 *  ■ Private data fields startTime and endTime with getter methods.
 *  ■ A no-arg constructor that initializes startTime with the current time.
 *  ■ A method named start() that resets the startTime to the current time.
 *  ■ A method named stop() that sets the endTime to the current time.
 *  ■ A method named getElapsedTime() that returns the elapsed time for the
 * stopwatch in milliseconds.
 *
 *  Draw the UML diagram for the class and then implement the class. Write a test
 * program that measures the execution time of sorting 100,000 numbers using
 * selection sort.
 *
 */
public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}

class StopwatchTest {

    public static void main(String[] args) {
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100000);
        }

        StopWatch stopwatch = new StopWatch();

        stopwatch.start();
        StopWatch.selectionSort(numbers);
        stopwatch.stop();

        System.out.println("Sorting 100,000 numbers using selection sort took " +
                stopwatch.getElapsedTime() + " milliseconds.");
    }
}