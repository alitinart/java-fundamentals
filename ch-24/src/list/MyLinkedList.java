package list;

public class MyLinkedList<E> extends MyAbstractList<E> {
    private Node<E> head, tail;

    public MyLinkedList() {
    }

    public MyLinkedList(E[] objects) {
        super(objects);
    }

    public E getFirst() {
        if (size == 0) {
            return null;
        } else {
            return head.element;
        }
    }

    public E getLast() {
        if (size == 0) {
            return null;
        } else {
            return tail.element;
        }
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e); // Create a new node
        newNode.next = head; // link the new node with the head
        head = newNode; // head points to the new node
        size++; // Increase list size

        if (tail == null) // The new node is the only node in the list
            tail = head;
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e); // Create a new node for e

        if (tail == null) {
            head = tail = newNode; // The only node in the list
        } else {
            tail.next = newNode; // Link the new node with the last node
            tail = tail.next; // tail now points to the last node
        }

        size++; // Increase size
    }


    @Override
    public void add(int index, E e) {
        if (index == 0)
            addFirst(e); // Insert first
        else if (index >= size)
            addLast(e); // Insert last
        else { // Insert in the middle
            Node<E> current = head;
            for (int i = 1; i < index; i++)
                current = current.next;
            Node<E> temp = current.next;
            current.next = new Node<E>(e);
            (current.next).next = temp;
            size++;
        }
    }


    public E removeFirst() {
        if (size == 0)
            return null; // Nothing to delete
        else {
            Node<E> temp = head; // Keep the first node temporarily
            head = head.next; // Move head to point to the next node
            size--; // Reduce size by 1
            if (head == null)
                tail = null; // List becomes empty
            return temp.element; // Return the deleted element
        }
    }


    public E removeLast() {
        if (size == 0)
            return null; // Nothing to remove
        else if (size == 1) { // Only one element in the list
            Node<E> temp = head;
            head = tail = null; // List becomes empty
            size = 0;
            return temp.element;
        } else {
            Node<E> current = head;

            for (int i = 0; i < size - 2; i++)
                current = current.next;

            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size)
            return null; // Out of range
        else if (index == 0)
            return removeFirst(); // Remove first
        else if (index == size - 1)
            return removeLast(); // Remove last
        else {
            Node<E> previous = head;

            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }

            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            result.append(current.element);
            current = current.next;
            if (current != null) {
                result.append(", ");
            } else {
                result.append("]");
            }
        }
        return result.toString();
    }

    @Override
    public void clear() {
        size = 0;
        head = tail = null;
    }

    @Override
    public boolean contains(E e) {
        if (head.element == e)
            return true;
        if(tail.element == e)
            return true;

        Node<E> currentElement = head.next;

        while (currentElement != null) {
            if(currentElement.element.equals(e))
                return true;
            currentElement = currentElement.next;
        }

        return false;
    }

    @Override
    public E get(int index) {
        E currentElement = null;
        int currentIndex = 0;
        for(int i = 0; i <= index; i++) {
            currentElement = head.next.element;
            currentIndex++;
        }

        return currentElement;
    }

    @Override
    public int indexOf(E e) {
        Node<E> currentElement = head;
        int currentIndex = 0;
        while (currentElement.next != null) {
            if(e.equals(currentElement.element)) {
                return currentIndex;
            }
            currentIndex++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E e) {
        Node<E> currentElement = head;
        int currentIndex = 0;
        int lastFoundIndex = 0;
        while (currentElement.next != null) {
            if(e.equals(currentElement.element)) {
                lastFoundIndex = currentIndex;
            }
            currentIndex++;
        }
        return lastFoundIndex;
    }

    @Override
    public E set(int index, E e) {
        int currentIndex = 0;
        Node<E> currentNode = head;

        while (currentNode.next != null) {
            if(currentIndex == index){
                currentNode.element = e;
            }
            currentIndex++;
        }
        return e;
    }

    @Override
    public java.util.Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements java.util.Iterator<E> {
        private Node<E> current = head;

        @Override
        public boolean hasNext() {
            return (current != null);
        }

        @Override
        public E next() {
            E e = current.element;
            current = current.next;
            return e;
        }

        @Override
        public void remove() {
            Node<E> removedNode = tail;
            Node<E> currentNode = head;
            if(tail.equals(head)) {
                head = null;
                tail = null;
                size = 0;
            }

            for(int i = 0; i < size - 2; i++) {
                if (currentNode.next.equals(removedNode)) {
                    tail = currentNode;
                    break;
                }
            }
        }
    }

    private static class Node<E> {
        E element;
        Node<E> next;
        Node<E> previous;

        public Node(E element) {
            this.element = element;
        }
    }
}

