import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * *17.12 (Combine files)

 * Write a utility program that combines the files together into a
 * new file using the following command:

 * java CombineFiles SourceFile1 . . . SourceFile2 TargetFile
 *
 */
public class CombineFiles {
    public static void main(String[] args) {
        String f1 = args[0];
        String f2 = args[1];
        String target = args[2];

        combine(f1, f2, target);
    }

    public static void combine(String path1, String path2, String target) {
        File file1 = new File(path1);
        File file2 = new File(path2);
        File targetFile = new File(target);

        try(
                FileInputStream fis1 = new FileInputStream(file1);
                FileInputStream fis2 = new FileInputStream(file2);
                FileOutputStream targetFos = new FileOutputStream(targetFile);
                ) {

            int byteRead;
            while ((byteRead = fis1.read()) != -1) {
                targetFos.write(byteRead);
            }
            while ((byteRead = fis2.read()) != -1) {
                targetFos.write(byteRead);
            }

            System.out.println("Files combined");
        } catch (IOException ex) {
            System.out.println("Error while combining files: " + ex.getMessage());
        }
    }
}
