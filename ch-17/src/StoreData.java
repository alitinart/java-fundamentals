import java.io.*;
import java.util.Date;

/**
 *
 * *17.5 (Store objects and arrays in a file)

 * Write a program that stores an array of the five
 * int values 1, 2, 3, 4, and 5, a Date object for the current time, and the double
 * value 5.5 into the file named Exercise17_05.dat.
 *
 */
public class StoreData {
    public static void main(String[] args) throws IOException {
        int[] array = new int[5];
        for(int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        Date date = new Date();
        double doubleNum = 5.5;

        try (
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Exercise17_05.dat", true));
                ) {
            out.writeObject(array);
            out.writeObject(date);
            out.writeDouble(doubleNum);
        }
    }
}
