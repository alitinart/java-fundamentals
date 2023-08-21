import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 *  ArrayIndexOutOfBoundException

 *  Write a program that meets the following requirements:
 *      ■ Creates an array with 100 randomly chosen integers.
 *      ■ Prompts the user to enter the index of the array, then displays the corresponding element value. If the specified index is out of bounds, display the
 *  message Out of Bounds
 *
 */
public class ArrayIndexOutOfBoundsException extends Exception{
    private String message;

    public ArrayIndexOutOfBoundsException(String message) {
        super(message);
        this.message = message;
    }
}

class TestException {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            list.add(new Random().nextInt());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a element out of the array: ");
        int integerIndex = scanner.nextInt();

        if(integerIndex > list.size() - 1) {
            throw new ArrayIndexOutOfBoundsException("Index provided is out of bounds");
        }

        System.out.println(list.get(integerIndex));
    }
}