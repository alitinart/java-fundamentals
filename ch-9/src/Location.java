import java.util.Scanner;

/**
 *
 * Location Class

 * Design a class named Location for locating a maximal
 * value and its location in a two-dimensional array. The class contains public data
 * fields row, column, and maxValue that store the maximal value and its indices
 * in a two-dimensional array with row and column as int types and maxValue as
 * a double type.
 *
 */
public class Location {
    public int row;
    public int column;
    public double maxValue;

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public static Location locateLargest(double[][] a) {
        double maxValue = 0;
        int maxValueRow = 0;
        int maxValueColumn = 0;

        for(int i  = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length - 1; j++) {
                if(maxValue < a[i][j]) {
                    maxValue = a[i][j];
                    maxValueRow = i;
                    maxValueColumn = j;
                }
            }
        }

        return new Location(maxValueRow, maxValueColumn, maxValue);
    }
}

class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        double[][] array = new double[rows][columns];

        System.out.println("Enter the array: ");
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextDouble();
            }
        }

        Location location = Location.locateLargest(array);
        System.out.println("The location of the largest element is "
                + location.maxValue +
                " at " +
                "(" + location.row + "," + location.column + ").");
    }
}
