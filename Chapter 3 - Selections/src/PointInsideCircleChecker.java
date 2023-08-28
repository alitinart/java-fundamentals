import java.util.Scanner;

public class PointInsideCircleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the coordinates of the point from the user
        System.out.print("Enter the x-coordinate: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the y-coordinate: ");
        double y = scanner.nextDouble();
        scanner.close();

        // Calculate the distance between the point (x, y) and the center (0, 0)
        double distance = Math.sqrt(x * x + y * y);

        // Check if the point is inside the circle with radius 100
        if (distance <= 10) {
            System.out.println("The point (" + x + ", " + y + ") is inside the circle.");
        } else {
            System.out.println("The point (" + x + ", " + y + ") is outside the circle.");
        }
    }
}