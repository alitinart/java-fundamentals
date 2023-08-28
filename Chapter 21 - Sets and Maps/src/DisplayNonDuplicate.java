import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * 21.2 (Display nonduplicate words in ascending order)

 * Write a program that reads
 * words from a text file and displays all the nonduplicate words in ascending order.
 * The text file is passed as a command-line argument
 *
 */
public class DisplayNonDuplicate {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Zig Zag\\Desktop\\java-fundamentals\\ch-21\\src\\file.txt");
        TreeSet<String> set = new TreeSet<>();

        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()) {
            String word = scanner.next();
            set.add(word);
        }

        System.out.println(set);
    }
}
