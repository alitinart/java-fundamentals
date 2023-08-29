import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ForkJoinPool;
import java.util.Random;

/**
 *
 * *30.12 (Parallel array initializer) Implement the following method using the Fork/
 * Join Framework to assign random values to the list.
 *
 * public static void parallelAssignValues(double[] list)
 *  Write a test program that creates a list with 9,000,000 elements and invokes
 * parallelAssignValues to assign random values to the list. Also
 * implement a sequential algorithm and compare the execution time of the
 * two. Note that if you use Math.random(), your parallel code execution time will be worse than the sequential code execution time because
 * Math.random() is synchronized and cannot be executed in parallel. To
 * fix this problem, create a Random object for assigning random values to a
 * small list.
 *
 */

public class ParallelArrayInitializer extends RecursiveAction {
    private static final int THRESHOLD = 100000;
    private double[] list;
    private int start;
    private int end;
    private Random random = new Random(); // Create a Random object for generating random values

    public ParallelArrayInitializer(double[] list, int start, int end) {
        this.list = list;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if (end - start <= THRESHOLD) {
            for (int i = start; i < end; i++) {
                list[i] = random.nextDouble(); // Assign random value using the Random object
            }
        } else {
            int mid = start + (end - start) / 2;
            ParallelArrayInitializer leftTask = new ParallelArrayInitializer(list, start, mid);
            ParallelArrayInitializer rightTask = new ParallelArrayInitializer(list, mid, end);

            invokeAll(leftTask, rightTask);
        }
    }

    public static void parallelAssignValues(double[] list) {
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(new ParallelArrayInitializer(list, 0, list.length));
    }

    public static void sequentialAssignValues(double[] list) {
        Random random = new Random();
        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextDouble();
        }
    }

    public static void main(String[] args) {
        int size = 9000000;
        double[] list1 = new double[size];
        double[] list2 = new double[size];

        long startTime = System.currentTimeMillis();
        parallelAssignValues(list1);
        long endTime = System.currentTimeMillis();
        System.out.println("Parallel assign time: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        sequentialAssignValues(list2);
        endTime = System.currentTimeMillis();
        System.out.println("Sequential assign time: " + (endTime - startTime) + "ms");
    }
}
