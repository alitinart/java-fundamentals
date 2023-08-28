import set.MyHashSet;

import java.util.ArrayList;
import java.util.Set;

/**
 *
 * **27.11 (setToList)

 * Write the following method that returns an ArrayList from a set.
 * public static <E> ArrayList<E> setToList(Set<E> s)
 *
 */

public class SetToList {
    public static <E> ArrayList<E> setToList(Set<E> s) {
        return new ArrayList<>(s);
    }

    public static <E> ArrayList<E> setToList(MyHashSet<E> s) {
        ArrayList<E> list = new ArrayList<>();
        for(E element: s) {
            list.add(element);
        }

        return list;
    }
}
