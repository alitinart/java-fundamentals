import java.io.*;
import java.util.Scanner;

/**
 *
 * *17.14 (Encrypt files)

 * Encode the file by adding 5 to every byte in the file.
 * Write a program that prompts the user to enter an input file name and an output file name and
 * saves the encrypted version of the input file to the output file.
 *
 */
public class Encryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String inputFileName = scanner.nextLine();
        System.out.println("Enter output file name: ");
        String outputFileName = scanner.nextLine();

        // Perform encryption
        encryptFile(inputFileName, outputFileName);

        System.out.println("File encrypted and saved as " + outputFileName);
    }

    private static void encryptFile(String inputFileName, String outputFileName) {
        try (FileInputStream inputStream = new FileInputStream(inputFileName);
             FileOutputStream outputStream = new FileOutputStream(outputFileName)) {

            int byteRead;
            while ((byteRead = inputStream.read()) != -1) {
                // Encrypt the byte by adding 5
                int encryptedByte = byteRead + 5;
                // Write the encrypted byte to the output file
                outputStream.write(encryptedByte);
            }
        } catch (IOException e) {
            System.err.println("Error processing the file: " + e.getMessage());
        }
    }
}
