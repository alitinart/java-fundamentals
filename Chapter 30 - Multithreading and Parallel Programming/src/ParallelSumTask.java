import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

/**
 *
 * *30.15 (Parallel sum) Implement the following method using Fork/Join to find the sum of a list.

 * public static double parallelSum(double[] list)
 * Write a test program that finds the sum in a list of 9,000,000 double values.
 *
 */

public class ParallelSumTask extends RecursiveTask<Double> {
    private static final int THRESHOLD = 100000; // Adjust this threshold based on your needs
    private double[] list;
    private int start;
    private int end;

    public ParallelSumTask(double[] list, int start, int end) {
        this.list = list;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Double compute() {
        if (end - start <= THRESHOLD) {
            double sum = 0;
            for (int i = start; i < end; i++) {
                sum += list[i];
            }
            return sum;
        } else {
            int mid = start + (end - start) / 2;
            ParallelSumTask leftTask = new ParallelSumTask(list, start, mid);
            ParallelSumTask rightTask = new ParallelSumTask(list, mid, end);

            leftTask.fork();
            double rightResult = rightTask.compute();
            double leftResult = leftTask.join();

            return leftResult + rightResult;
        }
    }

    public static double parallelSum(double[] list) {
        ForkJoinPool pool = new ForkJoinPool();
        return pool.invoke(new ParallelSumTask(list, 0, list.length));
    }

    public static void main(String[] args) {
        int size = 9000000;
        double[] list = new double[size];
        for (int i = 0; i < size; i++) {
            list[i] = Math.random(); // Filling the array with random double values
        }

        long startTime = System.currentTimeMillis();
        double sum = parallelSum(list);
        long endTime = System.currentTimeMillis();

        System.out.println("Parallel sum: " + sum);
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
    }
}