import java.util.Scanner;

/**
 *
 * Sum Array

 * Write a method that sums all the numbers
 * in the major diagonal in an n * n matrix of double values using the following
 * header:
 * public static double sumMajorDiagonal(double[][] m)
 *  Write a test program that reads a 4-by-4 matrix and displays the sum of all its
 * elements on the major diagonal
 *
 */
public class SumArray {

    public static void main(String[] args){
        double[][] array = new double[4][4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        for(int i = 0; i < 4; i++) {
            System.out.println(" ");
            for(int j = 0; j < 4; j++) {
                array[i][j] = scanner.nextDouble();
            }
        }

        calculateMajorDiag(array);
    }

    public static void calculateMajorDiag(double[][] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i][i];
        }

        System.out.println("Sum of the elements in the major diagonal: " + total);
    }
}
