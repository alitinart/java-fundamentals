import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * *20.1 (Display words in ascending alphabetical order)

 * Write a program that reads
 * words from a text.txt file and displays all the words (duplicates allowed) in ascending alphabetical order. The words must start with a letter. The text.txt file is passed
 * as a command-line argument.1
 *
 */
public class WordSort {
    public static void main(String[] args) {
        File file = new File(args[0]);

        try(Scanner scanner = new Scanner(file)) {
            ArrayList<String> words = new ArrayList<>();
            while(scanner.hasNext()) {
                words.add(scanner.next());
            }

            Collections.sort(words);
            System.out.println(words);
        } catch (IOException ex) {
            System.out.println("Error occurred: " + ex.getMessage());
        }
    }
}
