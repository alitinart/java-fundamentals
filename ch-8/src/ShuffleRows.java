import java.util.Arrays;
import java.util.Random;

/**
 *
 * Shuffle Rows

 * Write a method that shuffles the rows in a two-dimensional int
 * array using the following header:
 * public static void shuffle(int[][] m)
 *  Write a test program that shuffles the following matrix:
 * int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
 *
 */
public class ShuffleRows {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

        shuffleArray(array);
    }

    public static void shuffleArray(int[][] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; i < array.length; i++) {
                int temp = array[i][j];
                int randomRow = (int) (Math.random() * array.length);
                int randomColumn = (int) (Math.random() * array[i].length);

                array[i][j] = array[randomRow][randomColumn];
                array[randomRow][randomColumn] = temp;
            }
        }

        printArray(array);
    }

    public static void printArray(int[][] array)
    {
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
                System.out.print(array[i][j] + " ");
    }
}
