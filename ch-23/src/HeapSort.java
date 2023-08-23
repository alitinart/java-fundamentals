import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * *23.8 (Sort using a heap)

 * Implement the following sort method using a heap.
 * public static <E extends Comparable<E>> void sort(E[] list)
 *
 */
public class HeapSort {
    public static void main(String[] args) {
        Integer[] integers = {9,7,4,3,21,5,6,3,2,1,6,88,54,334,5,3};
        sort(integers);
        System.out.println(Arrays.toString(integers));
    }

    public static <E extends Comparable<E>> void sort(E[] list) {
        Heap<E> heap = new Heap<>();

        for(E o : list) {
            heap.add(o);
        }

        for(int i = list.length - 1; i >= 0; i--) {
            list[i] = heap.remove();
        }
    }
}

class Heap<E extends Comparable<E>> {
    private ArrayList<E> list = new ArrayList<>();

    public Heap() {
    }

    public Heap(E[] list){
        for(E o : list)
            add(o);
    }

    public void add(E o) {
        list.add(o);
        int currentIndex = list.size() - 1;

        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;
            if(list.get(currentIndex).compareTo(list.get(parentIndex)) > 0) {
                E temp = list.get(parentIndex);
                list.set(parentIndex, list.get(currentIndex));
                list.set(currentIndex, temp);
            } else {
                break;
            }

            currentIndex = parentIndex;
        }
    }

    public E remove() {
        if (list.size() == 0) return null;

        E removedObject = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.remove(list.size() - 1);

        int currentIndex = 0;
        while(currentIndex < list.size()) {
            int leftChildIndex = currentIndex * 2 + 1;
            int rightChildIndex = currentIndex * 2 + 2;
            if(leftChildIndex >= list.size()) break;
            int maxIndex = leftChildIndex;
            if(rightChildIndex < list.size()) {
                if(list.get(maxIndex).compareTo(list.get(rightChildIndex)) < 0) {
                    maxIndex = rightChildIndex;
                }
            }

            if(list.get(currentIndex).compareTo(list.get(maxIndex)) < 0) {
                E temp = list.get(maxIndex);
                list.set(maxIndex, list.get(currentIndex));
                list.set(currentIndex, temp);
                currentIndex = maxIndex;
            } else {
                break;
            }
        }

        return removedObject;
    }

    public int getSize() {
        return list.size();
    }
}