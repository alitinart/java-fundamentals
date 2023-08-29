import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * 30.4 (Synchronize threads)

 * Write a program that launches 1,000 threads. Each
 * thread adds 1 to a variable sum that initially is 0. Define an Integer wrapper
 * object to hold sum. Run the program with and without synchronization to see
 * its effect
 *
 */

public class SyncThreads {
    private static Sum sum = new Sum();
    private static SyncedSum syncedSum = new SyncedSum();

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i = 0; i < 1000; i++) {
//            executorService.execute(new IntegerTask());
            executorService.execute(new IntegerTask());
        }
        executorService.shutdown();

        while (!executorService.isTerminated()) {
        }
        System.out.println(sum.getSum());
    }


    // Unsynchronized Task
     public static class IntegerTask implements Runnable {
        @Override
        public void run() {
//            sum.add();
            syncedSum.add();
        }
    }

    // Synced Task
    public static class SyncedIntegerTask implements Runnable {
        @Override
        public void run() {
            sum.add();
        }
    }

    static class SyncedSum {
        private static Lock lock = new ReentrantLock();
        public Integer summed;

        public SyncedSum() {
            this.summed = 0;
        }

        public void add() {
            lock.lock();

            try {
                int newSum = summed + 1;
                Thread.sleep(5);
                summed = newSum;
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

        public Integer getSum() {
            return summed;
        }
    }


    static class Sum {
        public Integer summed;

        public Sum() {
            this.summed = 0;
        }

        public void add() {
            summed = summed + 1;
        }

        public Integer getSum() {
            return summed;
        }
    }
}
