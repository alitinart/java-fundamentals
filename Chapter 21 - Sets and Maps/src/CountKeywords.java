import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * Case Study: Count Keywords
 *
 */
public class CountKeywords {
    public static void main(String[] args) {
        String filename = args[0];
        File file = new File(args[0]);

        if (file.exists()) {
            try {
                int keywordCount = countKeywords(file);
                System.out.println("The number of keywords in " + filename + " is " + keywordCount);
            } catch (FileNotFoundException e) {
                System.out.println("Error reading the file: " + e.getMessage());
            }
        } else {
            System.out.println("File " + filename + " does not exist");
        }
    }

    public static int countKeywords(File file) throws FileNotFoundException {
        String[] keywordString = {
                "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float",
                "for", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
                "new", "package", "private", "protected", "public", "return", "short", "static", "strictfp",
                "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void",
                "volatile", "while", "true", "false", "null"
        };

        Set<String> keywordSet = new HashSet<>(Arrays.asList(keywordString));
        int count = 0;

        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                String word = input.next();
                if (keywordSet.contains(word)) {
                    count++;
                }
            }
        }

        return count;
    }
}
