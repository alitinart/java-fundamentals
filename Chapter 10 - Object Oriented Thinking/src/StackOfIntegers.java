/**
 *
 * Stack
 *
 * Create a Integer Stack class based on the give UML description.
 *
 */
public class StackOfIntegers {

    private int[] elements;
    private int size;

    public StackOfIntegers() {
        this(16);
    }

    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    public boolean empty() {
        return size == 0;
    }

    public int peek() {
        return elements[size - 1];
    }

    public void push(int value) {
        if (size == elements.length) {
            int[] newElements = new int[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[size] = value;
        size++;
    }

    public int pop() {
        int poppedValue = elements[size - 1];
        size--;
        return poppedValue;
    }

    public int getSize() {
        return size;
    }
}

class TestStackOfIntegers {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        for(int i = 0; i < 16; i++)
            stack.push(i);

        while(!stack.empty()) {
            System.out.println(stack.pop() + " ");
        }
    }
}