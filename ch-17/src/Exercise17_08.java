import java.io.*;

/**
 *
 * *17.8 (Update count)

 * Suppose you wish to track how many times a program has been
 * executed. You can store an int to count the file. Increase the count by 1 each
 * time this program is executed. Let the program be Exercise17_08 and store the
 * count in Exercise17_08.dat
 *
 */
import java.io.*;

public class Exercise17_08 {
    public static void main(String[] args) {
        int count = readCount();
        count++; // Increase the count

        System.out.println("This program has been executed " + count + " times.");

        writeCount(count); // Update the count in the file
    }

    private static int readCount() {
        try {
            FileInputStream fis = new FileInputStream("Exercise17_08.dat");
            DataInputStream dis = new DataInputStream(fis);
            int count = dis.readInt();
            dis.close();
            return count;
        } catch (IOException e) {
            // Return 0 if the file doesn't exist or an error occurs while reading
            return 0;
        }
    }

    private static void writeCount(int count) {
        try {
            FileOutputStream fos = new FileOutputStream("Exercise17_08.dat");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(count);
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}