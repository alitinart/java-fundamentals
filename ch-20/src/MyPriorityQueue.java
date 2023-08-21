import java.util.PriorityQueue;

/**
 *
 * 20.12 (Clone PriorityQueue)

 * Define MyPriorityQueue class that extends
 * PriorityQueue to implement the Cloneable interface and implement the
 * clone() method to clone a priority queue.
 *
 */
public class MyPriorityQueue extends PriorityQueue implements Cloneable {

    @Override
    public MyPriorityQueue clone() {
        try {
            return (MyPriorityQueue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
