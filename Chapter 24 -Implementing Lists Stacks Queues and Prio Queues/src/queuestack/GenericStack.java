package queuestack;

import list.MyArrayList;

public class GenericStack<E> {
    private MyArrayList<E> list = new MyArrayList<>();

    public void push(E o) {
        list.add(o);
    }

    public E pop() {
        E poppedObject = list.get(list.size() - 1);
        list.remove(list.size() - 1);

        return poppedObject;
    }

}
