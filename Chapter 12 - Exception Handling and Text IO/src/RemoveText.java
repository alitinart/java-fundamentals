import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * Remove Text

 * Write a program that removes all the occurrences of a specified
 * string from a text file. For example, invoking
 * java Exercise12_11 John filename
 *  removes the string John from the specified file. Your program should get the
 * arguments from the command line.
 *
 */
public class RemoveText {
    public static void main(String[] args) throws FileNotFoundException {
        String stringToRemove = args[0];
        File file = new File(args[1]);
        String fileToText = fileToString(file.getPath());
        fileToText = fileToText.replaceAll(stringToRemove, "");

        if (!file.exists()) {
            throw new RuntimeException("File does not exist");
        }

        try (
                PrintWriter printWriter = new PrintWriter(file);
        ) {
            printWriter.flush();
            printWriter.println(fileToText);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

     public static String fileToString(String filePath) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filePath));
        StringBuffer sb = new StringBuffer();

        while(scanner.hasNext()) {
            sb.append(scanner.nextLine());
        }

        return sb.toString();
    }
}
