package algorthim;

import java.util.ArrayList;
import java.util.Arrays;

public class HeapSort {
    public static <E extends Comparable<E>> void heapSort(E[] list) {
        Heap<E> heap = new Heap<>();

        for (E e : list) {
            heap.add(e);
        }

        for(int i = list.length - 1; i >= 0; i--) {
            list[i] = heap.remove();
        }
    }

    public static void main(String[] args) {
        Integer[] list = {-44, -5, -3, 3, 3, 1, -4, 0, 1, 2, 4, 5, 53};
        heapSort(list);
        System.out.println(Arrays.toString(list));
    }
}

class Heap<E extends Comparable<E>> {
    private ArrayList<E> list = new ArrayList<>();

    public Heap() {
    }

    public Heap(E[] objects) {
        for (E o : objects)
            add(o);
    }

    public void add(E o) {
        list.add(o);
        int currentIndex = list.size() - 1;

        while(currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;
            if(list.get(currentIndex).compareTo(list.get(parentIndex)) > 0) {
                E temp = list.get(currentIndex);
                list.set(currentIndex, list.get(parentIndex));
                list.set(parentIndex, temp);
            } else {
                break;
            }

            currentIndex = parentIndex;
        }
    }

    public E remove() {
        if(list.size() == 0) return null;

        E removedObject = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.remove(list.size() - 1);

        int currentIndex = 0;
        while(currentIndex < list.size()) {
            int leftChildIndex = 2 * currentIndex + 1;
            int rightChildIndex = 2 * currentIndex + 2;

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
            } else
                break;
        }

        return removedObject;
    }

    public int getSize() {
        return list.size();
    }
}