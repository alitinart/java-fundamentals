/**
 *
 * **9.9 Regular Polygon Class

 * In an n-sided regular polygon, all sides
 * have the same length and all angles have the same degree (i.e., the polygon is
 * both equilateral and equiangular).
 *
 */
public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon() {
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public double getPerimeter() {
        return this.n * this.side;
    }

    public double getArea() {
        return (this.n * Math.pow(this.side, 2)) / (4 * Math.tan((Math.PI / this.n)));
    }
}

class PolygonTest {
    public static void main(String[] args) {
        RegularPolygon pol1 = new RegularPolygon();
        RegularPolygon pol2 = new RegularPolygon(6,4);
        RegularPolygon pol3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Area of first polygon: " + pol1.getArea());
        System.out.println("Area of second polygon: " + pol2.getArea());
        System.out.println("Area of third polygon: " + pol3.getArea());
    }
}