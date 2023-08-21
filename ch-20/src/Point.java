import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Point implements Comparable<Point> {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x != o.x) {
            return Integer.compare(this.x, o.x);
        } else {
            return Integer.compare(this.y, o.y);
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class CompareY implements Comparator<Point> {
    @Override
    public int compare(Point p1, Point p2) {
        if(p1.getX() != p2.getY()) {
            return Integer.compare(p1.getY(), p2.getY());
        } else {
            return Integer.compare(p2.getX(), p2.getX());
        }
    }
}

class PointSorting {
    public static void main(String[] args) {
        Point[] points = generateRandomPoints(100);

        System.out.println("Points sorted by x-coordinates:");
        Arrays.sort(points);
        displayPoints(points);

        System.out.println("\nPoints sorted by y-coordinates:");
        Arrays.sort(points, new CompareY());
        displayPoints(points);
    }

    private static Point[] generateRandomPoints(int numPoints) {
        Random random = new Random();
        Point[] points = new Point[numPoints];
        for (int i = 0; i < numPoints; i++) {
            int x = random.nextInt(101);
            int y = random.nextInt(101);
            points[i] = new Point(x, y);
        }
        return points;
    }

    private static void displayPoints(Point[] points) {
        for (Point point : points) {
            System.out.println(point);
        }
    }
}