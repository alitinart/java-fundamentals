import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * Case Study: Find Directory Size
 *
 */
public class FindDirectorySize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter directory path: ");
        File dir = new File(scanner.nextLine());

        System.out.println("Directory has a total size of: " + getDirSize(dir));
    }

    public static long getDirSize(File dir) {
        long count = 0;
        if(!dir.isDirectory()) {
            count += dir.length();
        }

        File[] fileList = dir.listFiles();

        for(int i = 0; fileList != null && i < fileList.length; i++) {
            count += getDirSize(fileList[i]);
        }

        return count;
    }
}
