import java.util.ArrayList;

/**
 *
 * 19.3 (Distinct elements in ArrayList)

 * Write the following method that returns a new
 * ArrayList. The new list contains the non-duplicate elements from the original list.
 *
 */
public class DistinctElements {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>() {
            {
                add(1);
                add(1);
                add(2);
                add(3);
                add(2);
                add(4);
            }
        };

        integers = removeDuplicates(integers);

        System.out.println(integers);
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> newList = new ArrayList<>();

        for(E o: list) {
            if (!newList.contains(o)) {
                newList.add(o);
            }
        }

        return newList;
    }
}
