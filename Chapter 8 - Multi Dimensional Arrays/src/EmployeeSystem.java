import java.util.Arrays;

/**
 *
 * Employee Hour System

 * Suppose the weekly hours for all
 * employees are stored in a two-dimensional array. Each row records an employee’s seven-day work hours with seven columns. For example, the following
 * array stores the work hours for eight employees. Write a program that displays
 * employees and their total hours in decreasing order of the total hours.
 *
 */
public class EmployeeSystem {
    public static void main(String[] args) {
        int[][] employeeHours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };

        int[] employeeHoursSum = new int[employeeHours.length];

        for(int i = 0; i < employeeHours.length; i++) {
            int hours = 0;
            for (int j = 0; j < employeeHours.length - 1; j++) {
                hours += employeeHours[i][j];
            }
            employeeHoursSum[i] = hours;
        }

        System.out.println(Arrays.toString(employeeHoursSum));
    }
}
