package prioqueue;

import java.util.ArrayList;

public class Heap<E extends Comparable<E>> {
    private ArrayList<E> list = new ArrayList<>();

    public Heap() {
    }

    public void add(E o) {
        list.add(o);
        int currentIndex = list.size() - 1;

        while(currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;
            E parentElement = list.get(parentIndex);
            E currentElement = list.get(currentIndex);

            if(currentElement.compareTo(parentElement) > 0) {
                list.set(currentIndex, parentElement);
                list.set(parentIndex, currentElement);

                currentIndex = parentIndex;
            } else {
                break;
            }
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
